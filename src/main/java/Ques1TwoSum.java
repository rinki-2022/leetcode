import java.util.*;

class Ques1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Solution to be implemented
        Map<Integer, Integer> seenMap = new HashMap<>();
        for (int i=0; i<nums.length;i++) {
            int tobeCheck = target - nums[i];
            if (seenMap.containsKey(tobeCheck)) {
                return new int[]{seenMap.get(tobeCheck), i};
            } else {
                seenMap.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] testCase = {2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = {0, 1};

        int[] result = twoSum(testCase, target);
        System.out.println("Test 1: " + (Arrays.equals(result, expectedResult) ? "Passed" : "Failed"));
    }
}