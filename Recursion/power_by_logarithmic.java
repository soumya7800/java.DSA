package Recursion;

import java.util.Scanner;

public class power_by_logarithmic {
    public static int power(int base, int power) {
        if (power == 0) return 1;
        if (power == -1) return 1/base;
        
        int halfPower = power(base, power / 2);
        int result = halfPower * halfPower;

        if (power % 2 != 0) {
            result *= base;
        }
        return result;
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
