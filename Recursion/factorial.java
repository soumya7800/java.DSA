package Recursion;

import java.util.Scanner;

public class factorial {

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the depth of the tree:");

        int depth = sc.nextInt();
        System.out.println(factorial(depth));
    }
}
