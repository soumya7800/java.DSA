package Pattern_printing;

import java.util.Scanner;

public class Alphabet_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last alphabet for the triangle (A-Z): ");
        int n = sc.nextInt();
        char ch = (char) ('A' + n - 1);
        int num = ch - 'A' + 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
}


// for printing the alphabet triangle we need to convert the integer value to character value by using type casting
// we take the input as an integer value which represents the position of the alphabet in the series
// then we calculate the character value by adding the integer value to the ASCII value of 'A' and subtracting 1
// finally we use nested loops to print the triangle pattern similar to the number triangle but instead of printing j we print the character value by converting j to its corresponding alphabet using type casting
// the output is basically print the alphabet triangle pattern 