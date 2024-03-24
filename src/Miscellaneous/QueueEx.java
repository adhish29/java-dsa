package Miscellaneous;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    // for Queue, use LinkedList
    // FIFO
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer((2));
        // System.out.println("first Element: " + q.peek());
        // System.out.println("removing First element: " + q.poll());
        System.out.println(q);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }
        System.out.println(q.isEmpty());
    }

}
