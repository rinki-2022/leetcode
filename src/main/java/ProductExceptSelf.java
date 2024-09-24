import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        return null;
    }

    public static void main(String[] args) {
        ProductExceptSelf solution = new ProductExceptSelf();

        // Example 1:
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf(nums1);
        System.out.println(Arrays.toString(result1));  // Output: [24, 12, 8, 6]

        // Example 2:
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.println(Arrays.toString(result2));  // Output: [0, 0, 9, 0, 0]
    }
}
