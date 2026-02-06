package String_Methods;
import java.util.Scanner;  
public class maximum_integer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        String [] arr = new String[n];
        System.out.println("Enter the elements of the array:");
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.next();
            mx = Math.max(mx, Integer.parseInt(arr[i]));
        
        }
        System.out.println("Maximum integer value in the array is: " + mx);
    }
}
