package Array.Array_Operrations;

public class Sort_0s_and_1s_2s {
    public static void main(String[] args) {
        int  [] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        int notZeroes = 0, notOnes=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==0)
                notZeroes++;

            if(arr[i]==1)
                notOnes++;
        }
        for(int i=0; i<n; i++)
        {
            if(i<notZeroes)
                arr[1]=0;
            else if(i<notZeroes+notOnes)
                arr[i] =2;
            else
                arr[i] = 2;
        }
    }
}


// it also called Dutch Flag Algorithm
// method -1 two pass solution
