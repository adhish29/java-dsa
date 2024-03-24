import java.util.ArrayList;
import java.util.List;

public class Practice {

    static void print() {
        System.out.println("Hello");
    }

    static int arrLen(int[] arr) {
        return arr.length;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arrLen(arr); i++) {
            System.out.println(arr[i]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(1);
        ans.add(0, a);
        b.add(2);
        ans.add(0, b);

        System.out.println(ans);

    }
}
