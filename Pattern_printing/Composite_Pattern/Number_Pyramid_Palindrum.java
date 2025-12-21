package Pattern_printing.Composite_Pattern;

import java.util.Scanner;

public class Number_Pyramid_Palindrum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            for(int k = i - 1; k >= 1; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

// composite for loops are used here to print the number pyramid palindromic pattern.// Output:
// Enter the number of rows: 5
//         1
//       1 2 1
//     1 2 3 2 1
//   1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1
//   for(int j=1; j<=n-i; j++) this is used to print spaces before numbers in each row.
//   for(int k=1; k<=i; k++) this is used to print increasing numbers in each row.
//   for(int k=i-1; k>=1; k--) this is used to print decreasing numbers in each row.
//   The first inner loop prints the leading spaces for each row to center the numbers.
//   The second inner loop prints the increasing sequence of numbers from 1 to i for each row.
//   The third inner loop prints the decreasing sequence of numbers from i-1 back down to
//   1 for each row.
//   The outer loop iterates through each row from 1 to n, where n is
//   the total number of rows specified by the user.
