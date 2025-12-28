import java.util.Scanner;

public class Passing_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Size input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: User enters elements
        inputArray(arr, sc);

        // Step 3: Display original array
        System.out.println("\nOriginal Array:");
        displayArray(arr);

        // Step 4: User updates array
        updateArray(arr, sc);

        // Step 5: Display updated array
        System.out.println("\nUpdated Array:");
        displayArray(arr);
    }

    // Method to take array input
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to update array element
    public static void updateArray(int[] arr, Scanner sc) {
        System.out.print("\nEnter index to update (0 to " + (arr.length - 1) + "): ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            System.out.print("Enter new value: ");
            int value = sc.nextInt();
            arr[index] = value;
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Method to display array
    public static void displayArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
