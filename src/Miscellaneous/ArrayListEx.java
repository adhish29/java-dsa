package Miscellaneous;

import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // List<Integer> l1 = new ArrayList<>();
        // List<Integer> l2 = new ArrayList<>();
        // l1.add(1);
        // l1.add(2);

        // l2.add(34);
        // l2.add(22);
        // l1.addAll(l2);
        // l1.set(1, 100);
        // System.out.println(l1.get(3));
        // l1.remove(2);
        // System.out.println(l1);
        // Collections.sort(l1, (a, b) -> a - b);
        // System.out.println(l1);
        // // convert ArrayList to an array
        // Integer[] arr = l1.toArray(new Integer[0]);
        // System.out.println(Arrays.toString(arr));

        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();

        l3.add(2);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        // System.out.println(l3.getClass().getSimpleName());
        System.out.println(l3);
        l4 = l3;
        l3 = new ArrayList<>();
        System.out.println(l3);
        System.out.println(l4);
    }
}
