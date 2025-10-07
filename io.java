// Complete the function printNumber which takes an integer input from the user and prints it on the screen.
import java.util.Scanner;

class io{
    public void printNumber(){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }
    

    public static void main(String[] args) {
        io user = new io();
        user.printNumber();


        
    }
}    