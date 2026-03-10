package Recursion;

import java.util.Scanner;

public class print_1_To_n_sum {
    public static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.println(n);
    }
    public static int sum(int n, int s) {
        if (n == 0) return s;
        return sum(n - 1, s + n);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the given number");
        int num = sc.nextInt();
        print(num);
        System.out.println("sum is " + sum(num, 0));
    }
}