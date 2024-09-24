import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i< nums.length - 2;i++){
            // this check is to skip duplicates
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i+1;
            int right = nums.length-1;
            while (left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left ++; // move pointer towards right to increase the sum to bring closer to 0
                } else if (sum >0){
                    right--; // move pointer towards left to decrease the sum to bring closer to 0
                } else {

                    // exact 0 means found the triplet.
                    result.add (Arrays.asList(nums[i] , nums[left] , nums[right]));

                    // to avoid duplicates

                    while (left < right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                    left++;
                    right--;
                }

                }
            }
        return result;
        }



    public static void main(String[] args) {
        ThreeSum solution = new ThreeSum();

        // Example 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums1));  // Output: [[-1,-1,2],[-1,0,1]]

        // Example 2
        int[] nums3 = {0, 1, 1};
        System.out.println(solution.threeSum(nums3));  // Output: []

        // Example 3
        int[] nums4 = {3, 0, -2, -1, 1, 2};
        System.out.println(solution.threeSum(nums4));  // Output: [[-2,-1,1],[-2,0,2],[-1,0,1]]
    }
}
