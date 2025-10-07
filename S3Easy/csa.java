import java.util.Scanner;

public class csa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Taking array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Check if array is sorted
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Output result
        if (isSorted)
            System.out.println("true");
        else
            System.out.println("false");

        sc.close();
    }
}
