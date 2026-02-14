import java.util.Scanner;

public class selecton_sort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort Logic
        for(int i = 0; i < n-1; i++) {
            int minIndex = i; // assume the minimum element is at index i
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j; // update the index of the minimum element
                }
            }
            // swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
