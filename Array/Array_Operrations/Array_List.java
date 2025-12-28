package Array.Array_Operrations;

import java.util.Arrays;

public class Array_List {
    public static void main(String[] args) 
    {
        int [] arr = {15, 20, 63, 44, 59};
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}


//  Arrays.sort() method is used to sort the elements of an array in ascending order.
// It is a static method provided by the java.util.Arrays class.
// In the example above, we first print the original array elements, then sort the array using Arrays.sort(arr),
// and finally print the sorted array elements.