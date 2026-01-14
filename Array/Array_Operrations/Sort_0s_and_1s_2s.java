package Array.Array_Operrations;

public class Sort_0s_and_1s_2s {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0};
        int n = arr.length;

        int countZero = 0, countOne = 0;

        // First pass: count 0s and 1s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                countZero++;
            else if (arr[i] == 1)
                countOne++;
        }

        // Second pass: overwrite array
        for (int i = 0; i < n; i++) {
            if (i < countZero)
                arr[i] = 0;
            else if (i < countZero + countOne)
                arr[i] = 1;
            else
                arr[i] = 2;
        }

        // Print result
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}


// it also called Dutch Flag Algorithm
// method -1 two pass solution
