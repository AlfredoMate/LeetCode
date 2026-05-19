class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int subarray_sum = 0;
        int min_length_array = Integer.MAX_VALUE;

        while (right < nums.length) {

            subarray_sum += nums[right];
            right++;
            while (subarray_sum >= target) {
                min_length_array = Math.min(min_length_array, right - left);
                subarray_sum -= nums[left];
                left++;
            }

        }
        return min_length_array == Integer.MAX_VALUE ? 0 : min_length_array;
    }














    //O(n²) solution
    public int minSubArrayLenSquareTimeSolution(int target, int[] nums) {
        int min_length_subarray = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int subarray_sum = 0;
            for (int j = i; j < nums.length; j++) {
                subarray_sum += nums[j];
                if (subarray_sum >= target) {
                    min_length_subarray = Math.min(min_length_subarray, j - i + 1);
                    break;
                }

            }
        }

        return min_length_subarray == Integer.MAX_VALUE ? 0 : min_length_subarray;
    }
}