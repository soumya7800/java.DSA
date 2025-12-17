package Pattern_printing;

import java.util.Scanner;

public class LowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows-");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++)  
                {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


// the output is basically print the lower triangle  of stars
