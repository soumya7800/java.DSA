package Array;

import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) 
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();   
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Sum of elements in the array: " + sum);
    }
}
