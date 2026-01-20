import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("You entered: " + n );
    }
}


// This program reads an integer from user input and prints it out.
// nextint() method of Scanner class is used to read the integer value.
// To run this program, compile it and execute. Then input an integer when prompted.
//   Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the console 