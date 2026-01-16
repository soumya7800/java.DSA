package Array.Multi_Dimension_Array;

import java.util.Scanner;

public class Roll_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] Rollno = new int[2][3];
        int[][] Marks = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter Roll Number of Student " + (i + 1) + " in Subject " + (j + 1) + ": ");
                Rollno[i][j] = sc.nextInt();
                System.out.print("Enter Marks of Student " + (i + 1) + " in Subject " + (j + 1) + ": ");
                Marks[i][j] = sc.nextInt();
            }
        }
    }
}
