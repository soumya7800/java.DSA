package Pattern_printing.Composite_Pattern;

import java.util.Scanner;

public class Star_Bridge_Inverted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"* ");
            }

            // Middle gap
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Next line
            System.out.println();
        }
    }
}
