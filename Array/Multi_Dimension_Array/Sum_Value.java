package Array.Multi_Dimension_Array;

import java.util.Scanner;

public class Sum_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][2];
        System.out.println("Enter elements of the 2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int Sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Sum += array[i][j];
            }
        }
        System.out.println("Sum of all elements in the array is: " + Sum);
    }
}
