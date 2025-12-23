package Array;

import java.util.Scanner;

public class Intitialize_Array {
    
    public static void main(String[] args) 
    {
        System.out.print("Enter the size of array: ");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int []arr= new int[n];

        System.out.println("Enter " + n + " elements of array:");

        for(int i=1; i<n; i++)
            {
            arr[i]= sc.nextInt();
        }
        for(int i=1; i<n; i++)
            {
            System.out.println(arr[i]);
            
        }
    }
}


// output as per the array length it take n-1 element int the array and print the same.