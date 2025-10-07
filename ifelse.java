import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks:" );
        int marks =sc.nextInt();

        System.out.println("Marks:" + marks );
        if (marks >= 90 && marks <= 100){
            System.out.println("Grade A");
        }else if (marks >= 70 && marks < 90){
            System.out.println("Grade B");
        }else if (marks >= 50 && marks < 70){
            System.out.println("Grade C");
        }else if (marks >= 35 && marks < 50){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }

        sc.close();
    }

    
}
