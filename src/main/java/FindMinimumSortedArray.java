public class FindMinimumSortedArray {
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            // this condition tells array is sorted and not rotated
            if (nums[left] < nums[right]) {
                return nums[left];
            }

            while (left < right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] > nums[right]) { //element has to be in right half
                        left = mid +1;
                } else {
                        right = mid;//elelment has to be in left half
                }
            }
            return nums[left];
        }

        public static void main(String[] args) {
            FindMinimumSortedArray solution = new FindMinimumSortedArray();

            int[] nums = {3, 4, 5, 1, 2};
            System.out.println("Minimum: " + solution.findMin(nums)); // Output: 1
        }
    }
