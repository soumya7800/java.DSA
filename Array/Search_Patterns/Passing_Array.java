package Array.Search_Patterns;

import java.util.Scanner;

public class Passing_Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        change(arr);
    }

    public static void change(int[] arr) 
    {
        for(int i=1; i<arr.length; i++)
        {
            arr[i] = arr[i] + 1;
            System.out.println(arr[i]);
        }
        for(int j=0; j<arr.length; j++)
        {
            int check = arr[j]; 
        {
            System.out.println(check);
        }
    }

    }
}