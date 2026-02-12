import java.util.Arrays;

public class build_in_sort {
    public static void main(String[] args) {
        
        int[] arr = {5, 1, 4, 2, 8};

       for(int ele : arr)
       {
        System.out.print(ele + " ");
       }
       System.out.println();
       Arrays.sort(arr);

        for(int ele : arr)
       {
        System.out.print(ele + " ");
       }
       System.out.println();
       
        }
    }

