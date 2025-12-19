package Pattern_printing;

import java.util.Scanner;

public class Alpha_Numeric_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the Alpha-Numeric Triangle: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
            {
                for(int j=i;j<=n;j++)
                {
                    if(i%2!=0) 
                    {
                        System.out.print((char)('A' + j - 1) + " ");
                    } 
                    else 
                        {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
    }
}


// In this Alpha-Numeric Triangle pattern, we alternate between printing alphabets and numbers based on the row number.
// For odd-numbered rows, we print alphabets starting from 'A', and for even-numbered rows, we print numbers starting from 1.
// We use nested loops where the outer loop iterates through each row and the inner loop handles the printing of characters or numbers based on the current row's parity.
// The condition (i%2!=0) checks if the row number is odd or even, and accordingly prints either the character or the number.
// The output is a triangle pattern where odd rows contain alphabets and even rows contain numbers.
