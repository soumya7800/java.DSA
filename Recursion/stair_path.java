package Recursion;

import java.util.Scanner;

public class stair_path {
    public static int stair(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return stair(n - 1) + stair(n - 2) + stair(n - 3);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of stairs");
        int num = sc.nextInt();
        System.out.println("the number of paths to climb the stairs is " + stair(num));
    }
}
