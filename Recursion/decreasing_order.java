package Recursion;

import java.util.Scanner;

public class decreasing_order {

    public static void decreasing_order(int n) {
        if (n == 0) return;
        System.out.println(n);
        decreasing_order(n - 1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the depth of the tree:");

        int nums = sc.nextInt();
        decreasing_order(nums);
    }
}
