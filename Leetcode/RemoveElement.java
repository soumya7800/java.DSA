public class RemoveElement {
    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        Solution obj = new Solution();
        int result = obj.removeElement(nums, val);

        System.out.println(result);
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}

// the countinue is just like the not it gives every time the opposite output as per the if else if and else it show the opposite output
// for example if we have to print even numbers from 1 to 10 we can use continue to skip odd numbers
// for example if we have to print even numbers from 1 to 10 we can use continue to skip odd numbers