package Pattern_printing.Composite_Pattern;

import java.util.Scanner;

public class Star_Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int nsp = n - 1;   // spaces
        int nst = 1;       // stars

        // Upper part
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }

            System.out.println();

            nsp--;        // spaces go down
            nst += 2;     // stars go up
        }

        // Lower part
        nsp = 1;
        nst -= 4;

        for (int i = 1; i <= n - 1; i++) {

            // Print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= nst; k++) {
                System.out.print("* ");
            }

            System.out.println();

            nsp++;        // spaces go up
            nst -= 2;     // stars go down
        }
    }
}

// Star Diamond – Simple Explanation

// This program prints a diamond shape using stars.

// The diamond is made using two parts:

// Upper pyramid

// Lower inverted pyramid

// 🔁 How the loops work (very simple)

// The first outer loop runs from 1 to n
// → It prints the upper half of the diamond (stars increase).

// The second outer loop runs from n-1 to 1
// → It prints the lower half of the diamond (stars decrease).

// 🔹 Inside each row

// First inner loop
// → Prints spaces so the stars stay in the center.

// Second inner loop
// → Prints stars.
// → Number of stars follows this rule: 2 × row - 1.

// 🔢 Important facts

// Stars increase until the middle row, then decrease.

// Spaces decrease until the middle row, then increase.

// Total rows printed = 2 × n - 1.

// 🧠 One-line memory trick

// Spaces go down, stars go up — then stars go down, spaces go up.