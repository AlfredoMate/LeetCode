class NumArray {

    private final int[] prefix_left_sum;

    public NumArray(int[] nums) {

        this.prefix_left_sum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix_left_sum[i+1] = prefix_left_sum[i] + nums[i];
        }

    }

    public int sumRange(int left, int right) {
        return prefix_left_sum[right + 1] - prefix_left_sum[left];
    }

}
