package Array.Array_Operrations;

import java.util.Scanner;

public class Two_Pointers {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array followed by the elements (sorted) and the target sum:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        int i = 0, j = n - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println(i + " " + j);
                return;
            }
            if (sum < target) i++;
            else j--;
        }

        System.out.println("-1 -1");
        sc.close();
    }
}
