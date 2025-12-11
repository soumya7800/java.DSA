import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<=0) {
            System.out.println("The number is non-positive.");
        } else if(n % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else {
            System.out.println("The number is positive and odd.");

        }
    }
}


// "=" this means to asign some thing in the program
// "==" this means to compare two things in the program