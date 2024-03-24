package Miscellaneous;

import java.util.Stack;

public class StackEx {
    // LIFO
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(100);
        System.out.println(st);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
