package LinkedList;

class Node {
    int value; // instance variables
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

}

public class SinglyLinkedList {
    private Node head; // instance variables
    private int size;

    public SinglyLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void prepend(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void append(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void insert(int val, int pos) {
        Node newNode = new Node(val);
        if (pos < 0 || pos > size) {
            return;
        } else if (pos == 0) {
            prepend(val);
        } else {
            Node prev = head;
            for (int i = 0; i < pos - 1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public void delete(int pos) {
        Node temp = head;
        if (pos < 0 || pos >= size) {
            return;
        } else if (pos == 0) {
            head = temp.next;
            temp.next = null;
        } else {
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            Node removedNode = temp.next;
            temp.next = temp.next.next;
            removedNode.next = null;
        }
        size--;
    }

    public void update(int val, int pos) {
        Node temp = head;
        if (pos < 0 || pos >= size) {
            return;
        } else if (pos == 0) {
            temp.value = val;
        } else {
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }
            temp.value = val;
        }
    }

    public boolean search(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void printMiddle() {
        Node slowPtr = head, fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

        }
        System.out.println("middle: " + slowPtr.value);
    }

    public void clearList() {
        Node cur = head;
        while (cur != null) {
            Node prev = cur;
            cur = prev.next;
            prev = null;
        }
        size = 0;
        head = null;

    }

    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is Empty!!!");
        }

        while (temp != null && temp.next != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        if (temp != null) {
            System.out.println(temp.value);
            System.out.println();
        }

    }

}
