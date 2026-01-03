package Array.Array_Operrations;

import java.util.Scanner;

public class Two_Variable {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array followed by the elements:");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        // Correct input
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }


        int i = 0;
        
        int j = n - 1;
        // Two-pointer swap
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


        
        // Print reversed array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
