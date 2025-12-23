package Array;

public class Array_Loop {
    public static void main(String[] args) 
    {
        int[] arr = new int[7];
        // Assigning values to array elements

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;
        arr[5] = 30;
        arr[6] = 35;
        // Looping through the array and printing each element
        for (int i = 0; i < 7; i++) {
            System.out.print(arr[i] + "`");
        }
    }
}
