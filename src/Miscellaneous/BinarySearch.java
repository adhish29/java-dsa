package Miscellaneous;

public class BinarySearch {

    public static boolean binarySearchIterative(int[] arr, int searchTerm) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == searchTerm) {
                return true;
            } else if (searchTerm < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static boolean binarySearchRecursive(int[] arr, int low, int high, int searchterm) {
        while (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;

        if (arr[mid] == searchterm) {
            return true;
        } else if (searchterm < arr[mid]) {
            return binarySearchRecursive(arr, low, mid - 1, searchterm);
        } else {
            return binarySearchRecursive(arr, mid + 1, high, searchterm);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 24, 56, 67, 89 };
        System.out.println(binarySearchIterative(arr, 10));
        System.out.println(binarySearchIterative(arr, 12));
        System.out.println(binarySearchIterative(arr, 24));
        System.out.println(binarySearchIterative(arr, 56));
        System.out.println(binarySearchIterative(arr, 67));
        System.out.println(binarySearchIterative(arr, 700));
        System.out.println("------------------------------");
        System.out.println(binarySearchRecursive(arr, 0, arr.length - 1, 10));
        System.out.println(binarySearchRecursive(arr, 0, arr.length - 1, 12));
        System.out.println(binarySearchRecursive(arr, 0, arr.length - 1, 24));
        System.out.println(binarySearchRecursive(arr, 0, arr.length - 1, 56));
        System.out.println(binarySearchRecursive(arr, 0, arr.length - 1, 67));
        System.out.println(binarySearchRecursive(arr, 0, arr.length - 1, 700));
    }
}
