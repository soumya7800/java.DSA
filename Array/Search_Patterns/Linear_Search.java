package Array.Search_Patterns;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array: ");
       int n = sc.nextInt();
         int arr[] = new int[n];

         System.out.println("Enter the elements of the array: ");

            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }

// solution
        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();
        boolean found = false;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == key)
            {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if(!found)
        {
            System.out.println("Element not found in the array.");
        }

    }
}