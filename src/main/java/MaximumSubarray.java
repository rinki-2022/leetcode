public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSubArraySum = nums[0];
        int currentSubArraySum =nums[0];

        for (int i=1; i < nums.length;i++){

            currentSubArraySum = Math.max(nums[i], currentSubArraySum + nums[i]);
            maxSubArraySum = Math.max (maxSubArraySum, currentSubArraySum);
        }
        return maxSubArraySum;
    }

    public static void main(String[] args) {
        MaximumSubarray solution = new MaximumSubarray();

        // Example 1:
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(nums1));  // Output: 6

        // Example 2:
        int[] nums2 = {1};
        System.out.println(solution.maxSubArray(nums2));  // Output: 1

        // Example 3:
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println(solution.maxSubArray(nums3));  // Output: 23
    }
}

