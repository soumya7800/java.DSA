package String_Methods;

import java.util.Scanner;

public class equality {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
            String str2 = sc.nextLine();
            if(str1.equals(str2)){
                System.out.println("Strings are equal.");
            } else {
                System.out.println("Strings are not equal.");

                // Using '==' operator
                if(str1 == str2){
                    System.out.println("Strings are equal using '=='.");
                } else {
                    System.out.println("Strings are not equal using '=='.");
                }
    }
}
}

// This code compares two strings for equality using both the equals() method and the '==' operator.
// The equals() method checks for value equality, while '==' checks for reference equality.
// Users can input their own strings to see the comparison results.
// Note: In most cases, use equals() for string comparison in Java.