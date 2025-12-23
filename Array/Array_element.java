package Array;

public class Array_element {
    public static void main(String[] args) 
    {
        int[] arr = new int[5];
        // Assigning values to array elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println(arr[0]); // Output: 10
        System.out.println(arr[1]); // Output: 20
        System.out.println(arr[2]); // Output: 30
        System.out.println(arr[3]); // Output: 40

        arr[0] += 10; // Incrementing the first element by 10
        System.out.println(arr[0]); // Output: 20

        arr[4] = 50; // Assigning value to the fifth element
        System.out.println(arr[4]); // Output: 50

        arr[3] = 99;
        System.out.println(arr[3]); // Output: 99
    }
}
