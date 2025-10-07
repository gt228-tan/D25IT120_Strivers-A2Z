import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();

        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        }
        input.close();
    }
}