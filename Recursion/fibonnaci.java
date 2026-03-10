package Recursion;

import java.util.Scanner;

public class fibonnaci {
    public static int fib(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fib(num - 1) + fib(num - 2);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the given number");
        int num = sc.nextInt();
        System.out.println("the fibonnaci number is " + fib(num));

    }
}
