package Miscellaneous;

import java.util.List;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(4);
        l.add(45);
        l.add(23);
        System.out.println(l);
        for (int i : l) {
            System.out.println(i);
        }

    }
}
