package Pattern_printing;

import java.util.Scanner;

public class Odd_Numeric_Table {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }
    }
}
