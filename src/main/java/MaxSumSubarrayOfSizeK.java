public class MaxSumSubarrayOfSizeK {

    public static int maxSumSubarrayOfSizeK(int[] nums, int k) {
        int maxSum = 0, windowSum = 0;

        for (int i=0; i < nums.length;i++){
            windowSum += nums[i];
            if (i >= k-1){
                maxSum = Math.max(maxSum, windowSum);

                windowSum -= nums[i - (k-1)];

            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumSubarrayOfSizeK(nums, k));  // Output: 9
    }
}
