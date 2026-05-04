import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> complementaries = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (complementaries.containsKey(complement)) {
                return new int[] {i, complementaries.get(complement)};
            }
            complementaries.put(nums[i], i);
        }
        return null;
    }
}