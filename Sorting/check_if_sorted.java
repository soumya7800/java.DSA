public class check_if_sorted
{
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        boolean isSorted = true;

        for(int i = 0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
                
            }
        }
        if(isSorted == true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}