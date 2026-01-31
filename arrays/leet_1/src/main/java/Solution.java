import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    /**
     * This method solves the problem but with a time complexity of n².
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumNsquareComplexity(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (j != i && (nums[i] + nums[j] == target)) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    /**
     * Time complexity O(n)
     * @param nums
     * @param target
     * @return
     */

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum_pairs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sum_pairs.containsKey(nums[i])) {
                return new int[]{i, sum_pairs.get(nums[i])};
            }
            sum_pairs.put(target - nums[i], i);
        }
        return  null;
    }
}
