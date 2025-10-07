import java.util.Scanner;

public class LeftRotateD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements as input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take number of rotations
        System.out.print("Enter number of rotations: ");
        int d = sc.nextInt();

        // Perform left rotation
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

        // Print rotated array
        System.out.print("Array after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
