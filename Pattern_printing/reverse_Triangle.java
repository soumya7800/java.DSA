package Pattern_printing;

import java.util.Scanner;

public class reverse_Triangle {
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++)
            {
                for(int j=1; j<=n; j++)
                {
                    if( i+j>n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }  
                }
            }
        }
    }

    // Output:
    // Enter the number of rows: 5
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *
    // hears the condition is the i+j>n; which means when the sum of row and column number is greater than n then print star otherwise print space.
    // This is how we get the reverse triangle pattern.
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Happy Coding!