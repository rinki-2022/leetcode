import java.util.Arrays;

class Ques3ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i=1; i< nums.length;i++){
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testCase1 = {1, 2, 3, 1};
        boolean expectedResult1 = true;

        int[] testCase2 = {1, 2, 3, 4};
        boolean expectedResult2 = false;

        System.out.println("Test 1: " + (containsDuplicate(testCase1) == expectedResult1 ? "Passed" : "Failed"));
        System.out.println("Test 2: " + (containsDuplicate(testCase2) == expectedResult2 ? "Passed" : "Failed"));
    }
}
