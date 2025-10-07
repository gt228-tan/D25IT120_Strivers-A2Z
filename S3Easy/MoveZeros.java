public class MoveZeros {

    public static void moveZeroes(int[] nums) {
        int insertPos = 0; // Position to insert the next non-zero element

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos] = num;
                insertPos++;
            }
        }

        // Fill the rest of the array with zeroes
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 4, 0, 5, 2};
        int[] nums2 = {0, 0, 0, 1, 3, -2};

        moveZeroes(nums1);
        moveZeroes(nums2);

        System.out.print("nums1 after moving zeros: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("nums2 after moving zeros: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}