package Array.Multi_Dimension_Array;

import java.util.Scanner;

public class Min_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][2];

        System.out.println("Enter elements of the 2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int min = array[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Minimum element in the array is: " + min);
    }
}
