public class fir {
    public static int maxSum(int[] nums, int k) {
        if (nums == null || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid array or window size");
        }

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right];
            windowSum -= nums[right - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 1, 3, 2};
        int k = 2;
        

        System.out.println(maxSum(nums, k));
    }
}
