package Recursion;

import java.util.Scanner;

public class power_by_recursion {
    public static int power(int base, int power) {
        if (power == 0) return 1;
        if (power == -1) return 1/base;
        
        return base * power(base, power - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base number");
        int base = sc.nextInt();
        System.out.println("enter the power number");

        int power = sc.nextInt();
        System.out.println("the result is " + power(base, power));

    }
}
