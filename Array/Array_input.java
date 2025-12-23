package Array;

import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        System.out.println("Enter " + n +" elements of array:");
        int[] arr = new int[n];
        // Assigning values to array elements
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("This is mine Array- "+ arr.length);
    }
}

//  output as per the array length it take n-1 element int the array and print the same.