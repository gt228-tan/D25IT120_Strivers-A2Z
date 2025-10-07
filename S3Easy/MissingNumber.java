public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum; // Missing number
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 2, 3, 1, 4};
        int[] nums2 = {0, 1, 2, 4, 5, 6};

        System.out.println(findMissingNumber(nums1)); // Output: 5
        System.out.println(findMissingNumber(nums2)); // Output: 3
    }
}