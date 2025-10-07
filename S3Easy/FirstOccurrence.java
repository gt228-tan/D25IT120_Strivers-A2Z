public class FirstOccurrence {

    public static int firstIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // Found the target, return index
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 5, 3};
        int[] nums2 = {2, -4, 4, 0, 10};

        System.out.println(firstIndex(nums1, 3));  // Output: 1
        System.out.println(firstIndex(nums2, 6));  // Output: -1
    }
}