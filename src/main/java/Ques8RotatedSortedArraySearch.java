import java.util.Arrays;

public class Ques8RotatedSortedArraySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("--mid---" + mid);

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Ques8RotatedSortedArraySearch searcher = new Ques8RotatedSortedArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(searcher.search(nums, target)); // Expected: 4
    }
}
