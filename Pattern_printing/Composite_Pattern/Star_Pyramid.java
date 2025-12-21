package Pattern_printing.Composite_Pattern;

import java.util.Scanner;

public class Star_Pyramid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i - 1; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


// composite for loops are used here to print the star pyramid pattern.// Output:
// Enter the number of rows: 5
//         *
//        ***
//       *****
//      *******
//     *********
//   for(int j=1; j<n-i; j++) this is used to print spaces before stars in each row.
//   for(int k=1; k<=2*i-1; k++) this is used to print stars in each row.
//   The number of stars in each row follows the pattern of odd numbers starting from 1.
//   Hence, for row i, the number of stars is given by the formula 2*i - 1.
//   This creates the pyramid shape as the number of stars increases by 2 for each subsequent row.
//   The outer loop iterates through each row from 1 to n, where n is the total number of rows specified by the user.
//   The first inner loop prints the leading spaces for each row to center the stars.
//   The second inner loop prints the stars for each row based on the current row number.