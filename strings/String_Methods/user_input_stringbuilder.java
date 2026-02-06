package String_Methods;

import java.util.Scanner;

public class user_input_stringbuilder {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        StringBuilder userInput = new StringBuilder(sc.nextLine());
        System.out.println("You entered: " + userInput.charAt(0));
        userInput.setCharAt(0, 'g');
        System.out.println("Length of the string: " + userInput.length());
    }
}
// This code takes user input to create a StringBuilder object and demonstrates basic operations like charAt and length.