import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< nums.length;i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                    return new int []{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}
