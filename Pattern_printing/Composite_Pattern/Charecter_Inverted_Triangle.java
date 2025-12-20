package Pattern_printing.Composite_Pattern;

import java.util.Scanner;

public class Charecter_Inverted_Triangle 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++);
            {
                System.out.println(" " + " ");
            }
                for(int k=1; k<=i; k++)
                {
                    System.out.print((char)(k + 64) + " ");
                }
                System.out.println();
        }
    }
}

// composite for loops are used here to print the character inverted triangle pattern.// Output:
// Enter the number of rows: 5
