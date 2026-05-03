class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sum_complete_range = (n * (n+1)) / 2;
        int sum_given_range = 0;
        for (int num : nums) {
            sum_given_range += num;
        }
        return sum_complete_range - sum_given_range;
    }
}