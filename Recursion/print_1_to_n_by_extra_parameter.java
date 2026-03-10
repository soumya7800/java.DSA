package Recursion;

import java.util.Scanner;

public class print_1_to_n_by_extra_parameter {
    public static void print(int n, int i) {
        if (i > n) return;
        // base case is when i is greater than n then it will return and stop the function
        System.out.println(i);
        // works as a stack and will print the value of i first and then will call the function again with i + 1 until it reaches n
        print(n, i + 1);
        // calling the function again with i + 1 until it reaches n and then it will return and print the value of i in reverse order
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the given number");
        int num = sc.nextInt();
        print(num, 1);
    }
}


// if i interchange the call and work like if the call is first and then the work then it will print the value of i in reverse order and then it will return and print the value of i in normal order
// for example if n = 5 then it will print 5 4 3 2 1 (when its not change)and then it will return and print 1 2 3 4 5 (afterit change)