package Miscellaneous;

import java.util.Arrays;
// import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        // usimg lambda
        // natural ordering (Ascending Order)
        // passing Comparator (Descending Order)
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);

        // using anonymous inner class
        // PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
        // public int compare(Integer i1, Integer i2) {
        // return i2 - i1;
        // }
        // });
        pq.offer(2);
        pq.offer(100);
        pq.offer(34);
        pq.offer(89);
        System.out.println(pq);
        Integer[] pqArr = pq.toArray(new Integer[0]);
        System.out.println("Array version: " + Arrays.toString(pqArr));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
