package Array.Array_Operrations;

public class Two_Sum {
    public static void main(String[] args) {
        int [] arr = {2, 7, 11, 15}; 
        int target = 17; 
        int n = arr.length;  

        

        // solution

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    System.out.println("Indices found: " + i + " " + j);
                }
            }
        }
    }
}
