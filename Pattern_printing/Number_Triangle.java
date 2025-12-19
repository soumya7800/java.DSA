package Pattern_printing;

import java.util.Scanner;

public class Number_Triangle {
    public static void main(String[] args) 
    {
        System.out.println("Number Triangle Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


// for printing the number triangle we basically change the condition in the printing statement  only we need to add j to print the number triangle because the j includes the for loop of j