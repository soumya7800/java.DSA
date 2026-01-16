package Array.Multi_Dimension_Array;

import java.util.Scanner;

public class Product_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][2];

        System.out.println("Enter elements of the 2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int product = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product *= array[i][j];
            }
        }
        System.out.println("Product of all elements in the array is: " + product);
    }
}
