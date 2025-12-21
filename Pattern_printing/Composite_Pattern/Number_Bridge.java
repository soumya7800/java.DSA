package Pattern_printing.Composite_Pattern;
import java.util.Scanner;

public class Number_Bridge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            // Left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            // Middle gap
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }

            // Right numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            // Next line
            System.out.println();
        }
    }
}
// composite for loops are used here to print the number bridge pattern.// Output:
// Enter the number of rows: 5
// 1 2 3 4 5           1 2 3 4 5
// 1 2 3 4       1 2 3 4
// 1 2 3   1 2 3
// 1 2 1 2
// 1     1
//   for(int j=1; j<=i; j++) this is used to print numbers on the left side in each row.
//   for(int k=1; k<=2*(n-i); k++) this is
//   used to print spaces in the middle gap of each row.
//   for(int j=1; j<=i; j++) this is used to print numbers on the right side in each row.
//   The first inner loop prints the increasing sequence of numbers from 1 to i for the
//   left side of each row.
//   The second inner loop prints the spaces in the middle gap, which increases by 2 for
//   each subsequent row.
//   The third inner loop prints the increasing sequence of numbers from 1 to i for the
//   right side of each row.
//   The outer loop iterates through each row from n down to 1, where n is the total
//   number of rows specified by the user.
