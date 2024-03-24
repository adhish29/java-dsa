package Miscellaneous;

public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        int elem = 100;

        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < k; i++) {
            newArr[j++] = arr[i];
        }
        newArr[j++] = elem;
        for (int i = k; i < arr.length; i++) {
            newArr[j++] = arr[i];
        }

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
