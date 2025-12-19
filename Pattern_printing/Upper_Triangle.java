package Pattern_printing;

import java.util.Scanner;

public class Upper_Triangle 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


// in this star triangle in each line the no of stars that are printed is equal to the row number
// in upper triangle both for looops are 99% same  only the real caatch is we just neet to oinitialize  j=1 for upper triangle and j=i for the loweer triangle
// the output is basically print the upper triangle of stars