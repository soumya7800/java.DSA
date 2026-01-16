package Array.Multi_Dimension_Array;

import java.util.Scanner;

public class Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Enter elements of the 3x3 array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int mx = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > mx) {
                    mx = array[i][j];
                }
            }
        }
        System.out.println("Largest element in the array is: " + mx);
    }
}
