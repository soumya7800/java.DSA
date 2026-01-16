package Array.Multi_Dimension_Array;

public class Initialization_Array {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5};
        for(int ele : arr) {
            System.out.print(ele + " ");
    }
    System.out.println();

    int [][] b ={{1, 2, 3}, {4, 5, 6}};
    for(int ele[] : b) {
        for(int x : ele) {
            System.out.print(x   + " ");
        }
        System.out.println();
}
    }
}

// Output:
// 1 2 3 4 5
// 1 2 3
// 4 5 6