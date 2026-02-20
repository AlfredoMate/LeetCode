public class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = (n * (n+1)) / 2;
        int partial_sum = 0;
        for (int num : nums) {
            partial_sum += num;
        }
        return total_sum - partial_sum;
    }
}
