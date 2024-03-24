// Separate Chaining 

package HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class HashNode<k, v> {
    k key;
    v value;
    final int hashCode;
    HashNode<k, v> next;

    public HashNode(k key, v value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

class Map<k, v> {
    private List<HashNode<k, v>> bucketArray;
    private int bucketSize; // current Capacity
    private int size;

    public Map() {
        bucketArray = new ArrayList<>();
        bucketSize = 10;
        size = 0;

        // create Empty Chains
        for (int i = 0; i < bucketSize; i++) {
            bucketArray.add(null);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private final int hashCode(k key) {
        return Objects.hashCode(key);
    }

    private int getBucketByIndex(k key) {
        int idx = Objects.hashCode(key) % bucketSize;
        return idx < 0 ? idx * -1 : idx;
    }

    public v get(k key) {
        int idx = getBucketByIndex(key);
        int hashCode = hashCode(key);

        HashNode<k, v> head = bucketArray.get(idx);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }
            head = head.next;
        }

        return null;

    }

    public v remove(k key) {
        int idx = getBucketByIndex(key);
        int hashCode = hashCode(key);

        HashNode<k, v> head = bucketArray.get(idx);
        HashNode<k, v> prev = null;

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode)
                break;
            prev = head;
            head = head.next;
        }

        if (head == null)
            return null;
        size--;

        if (prev == null) {
            bucketArray.set(idx, head.next);
        } else {
            prev.next = head.next;
            head.next = null;
        }
        return head.value;
    }

    public void add(k key, v value) {
        int idx = getBucketByIndex(key);
        int hashCode = hashCode(key);
        HashNode<k, v> head = bucketArray.get(idx);

        while (head != null) {
            // key already Exists
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // key doesn't exist -- new idx || key doesn't exist -- collison
        head = bucketArray.get(idx);
        HashNode<k, v> newNode = new HashNode<k, v>(key, value, hashCode);
        newNode.next = head;
        size++;
        bucketArray.set(idx, newNode);

        // If load factor goes beyond threshold, then
        // double hash table size
        if (1.0 * size / bucketSize > 0.7) {
            List<HashNode<k, v>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            size = 0;
            bucketSize = 2 * bucketSize;
            for (int i = 0; i < bucketSize; i++) {
                bucketArray.add(null);
            }

            for (HashNode<k, v> node : temp) {
                while (node != null) {
                    add(node.key, node.value);
                    node = node.next;
                }
            }
        }
    }

    public void print() {
        System.out.println(bucketArray.size());
        for (HashNode<k, v> node : bucketArray) {
            while (node != null) {
                System.out.print("<" + node.key + ", " + node.value + ">" + " -> ");
                node = node.next;
            }
            System.out.println(node);
        }
    }
}

public class HashMapImpl {

    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        map.add("this", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);
        map.add("adhish", 33);
        map.add("akg", 21);
        map.add("der", 1);
        // map.add("dsd", 2);
        map.remove("dsd");
        map.add("mkv", 1);
        map.add("eqq", 1);
        map.add("dsf", 5);
        map.add("ret", 31);
        // System.out.println(map.size());
        // System.out.println(map.remove("this"));
        // System.out.println(map.remove("this"));
        // System.out.println(map.size());
        // System.out.println(map.isEmpty());
        // System.out.println(map.get("coder"));
        map.print();
        // map.remove("coder");
        // map.print();
    }
}
