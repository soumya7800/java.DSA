

public class binarysort {
    public static void main(String[] args) {
        
        int[] arr = {5, 2, 9, 1, 5, 6};
        int n = arr.length;
        // Sort the array using built-in sort method
        int target = 5; // Element to search for
        int lo = 0, hi = n - 1;
        boolean found = false;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // Calculate the middle index
            if (arr[mid] == target) {
                found = true; // Target found
                break;
            } else if (arr[mid] < target) {
                lo = mid + 1; // Search in the right half
            } else {
                hi = mid - 1; // Search in the left half
            }
        }
        System.out.println("Element found: " + found);
    }
}
