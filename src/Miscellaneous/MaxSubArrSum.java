package Miscellaneous;

public class MaxSubArrSum {

    public static void maxSubSumIterative(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }

    public static void maxSubSum(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int lower = 0, ansStart = 0, ansEnd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                lower = i;
            }
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = lower;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + ", ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSubSum(arr);
        System.out.println();
        maxSubSumIterative(arr);
    }

}
