package String_Methods;

import java.util.Scanner;

public class string_toggle {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);
        StringBuilder toggled = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char h = str.charAt(i);
            int ascii = (int)h;
            if(ascii >= 65 && ascii <= 90)
                {
                // Uppercase to lowercase
                char lower = (char)(ascii + 32);
                toggled.append(lower);
            } 
            else if(ascii >= 97 && ascii <= 122){
                // Lowercase to uppercase
                char upper = (char)(ascii - 32);
                toggled.append(upper);
            } 
            else 
                {
                // Non-alphabetic characters remain unchanged
                toggled.append(h);
            }
        }
        System.out.println("Toggled string: " + toggled);
    }
}

// // This code toggles the case of each character in the input string.
// Uppercase letters are converted to lowercase and vice versa.
// Non-alphabetic characters remain unchanged.
// Users can input their own strings to see the toggled result.
// Note: This implementation uses ASCII values to determine character cases.
// 32 is added or subtracted to toggle the case.
// The result is built using StringBuilder for efficiency.
// Finally, the toggled string is printed to the console.
// Example: Input "Hello World!" -> Output "hELLO wORLD!"
// Feel free to test with different strings!
