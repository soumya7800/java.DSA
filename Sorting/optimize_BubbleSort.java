import java.util.Scanner;

public class optimize_BubbleSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        // Optimized Bubble Sort Logic
        for(int i = 0 ; i< n-1; i++)
        {

            boolean flag = false; // to check if any swapping occurs
            for(int j = 0; j < n-1-i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = true; // swapping occurs
                    
                }
            }
            if(flag == false) // if no swapping occurs, the array is already sorted
            {
                break;
            }
        }
        // after the parsing end the max element always comes at the end of the array
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}


// time complexity: O(n^2) in worst case and O(n) in best case (when the array is already sorted)
// space complexity: O(1) as we are using only a constant amount of extra space