package Miscellaneous;

public class ArrayRemove {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 4;

        // method 1
        // for (int i = k; i < arr.length - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // for (int i = 0; i < arr.length - 1; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // method 2
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < k; i++) {
            newArr[j++] = arr[i];
        }
        for (int i = k + 1; i < arr.length; i++) {
            newArr[j++] = arr[i];
        }

        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
