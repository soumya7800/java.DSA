package Array.Multi_Dimension_Array;

public class Waveform_array {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 10, 7, 20};
        int n = arr.length;

        // Sort the array
        java.util.Arrays.sort(arr);

        // Create waveform array
        int[] waveform = new int[n];
        int left = 0;
        int right = n - 1;
        int index = 0;

        while (left <= right) {
            if (index % 2 == 0) {
                waveform[index] = arr[right];
                right--;
            } else {
                waveform[index] = arr[left];
                left++;
            }
            index++;
        }

        // Print the waveform array
        System.out.println("Waveform Array:");
        for (int num : waveform) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
