// Row-Wise and Column-Wise Transpose of a Matrix

package Array.Multi_Dimension_Array;

import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Row-Wise Transpose
        int[][] rowWiseTranspose = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowWiseTranspose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nRow-Wise Transpose:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(rowWiseTranspose[i][j] + " ");
            }
            System.out.println();
        }

        // Column-Wise Transpose
        int[][] columnWiseTranspose = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                columnWiseTranspose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nColumn-Wise Transpose:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(columnWiseTranspose[i][j] + " ");
            }
            System.out.println();
        }
    }
}   