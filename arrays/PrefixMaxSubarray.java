// TC - O(n^2); SC - O(n);
public class PrefixMaxSubarray {

    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int cs = prefix[j] - (i > 0 ? prefix[i - 1] : 0);
                maxSum = Math.max(maxSum, cs);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum Subarray Sum = " + maxSubarraySum(arr));
    }
}
