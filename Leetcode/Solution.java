import java.util.*;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int needed = target - num;

            if (mpp.containsKey(needed)) {
                return new int[]{mpp.get(needed), i};
            }

            mpp.put(num, i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = s.twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
