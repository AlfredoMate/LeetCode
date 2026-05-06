class Solution {
    public int[] sortedSquares(int[] nums) {
        int left_pointer = 0;
        int right_pointer = nums.length - 1;
        int[] result = new int[nums.length];
        int position = right_pointer;

        while (left_pointer <= right_pointer) {
            if (nums[left_pointer] * nums[left_pointer] >= nums[right_pointer] * nums[right_pointer]) {
                result[position] = nums[left_pointer] * nums[left_pointer];
                left_pointer++;
            } else {
                result[position] = nums[right_pointer] * nums[right_pointer];
                right_pointer--;
            }
            position--;
        }
        return result;
    }
}