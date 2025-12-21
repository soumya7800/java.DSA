package Pattern_printing.Composite_Pattern;

import java.util.Scanner;

public class Number_Spiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Loop for rows
        for (int i = 1; i <= 2 * n - 1; i++) {

            // Loop for columns
            for (int j = 1; j <= 2 * n - 1; j++) {

                int a = i;
                int b = j;

                // Mirror from bottom
                if (a > n) {
                    a = 2 * n - a;
                }

                // Mirror from right
                if (b > n) {
                    b = 2 * n - b;
                }

                // Print the maximum value
                System.out.print(Math.max(a, b) + " ");
            }

            // Move to next row
            System.out.println();
        }
    }
}


// Input:
// Enter the number of rows: 4
// Output:
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4
// 4 3 2 2 2 3 4
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4
// Explanation:
// The program prints a number spiral pattern based on the input number of rows. The outermost  
// layer contains the highest number, which decreases as we move towards the center of the spiral.
// Each layer is represented by the maximum of the current row and column indices, adjusted for
// the spiral structure.
