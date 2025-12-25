package Array;

import java.util.Scanner;
public class Maxum_Value {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for(int i=1; i<n; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }
}


// maximum value in an array.