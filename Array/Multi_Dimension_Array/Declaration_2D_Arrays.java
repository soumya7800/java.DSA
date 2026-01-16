package Array.Multi_Dimension_Array;

public class Declaration_2D_Arrays {
    public static void main(String[] args) {
        int [][] array1 = new int[3][4]; // 3 rows and 4 columns
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[0][3] = 4;
        array1[1][0] = 5;
        array1[1][1] = 6;
        array1[1][2] = 7;
        array1[1][3] = 8;
        array1[2][0] = 9;
        array1[2][1] = 10;
        array1[2][2] = 11;

        array1[2][3] = 12;
        System.out.println("Elements of array1:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }   
    }
}
