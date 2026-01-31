// take integer input and convert it to string

import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Convert the integer to a string
        String numberAsString = Integer.toString(number);
        
        // Print the string representation of the integer
        System.out.println("String representation: " + numberAsString);
        
        scanner.close();
    }
}
