class Solution {


    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public int[] countBitsLinearithmicSolution(int n) {

        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 0; i <= n; i++) {
            int number_bits_set = 0;
            int current_weight = 1;
            while (current_weight <= i) {

                int times_divisible = i / current_weight;
                if (times_divisible % 2 != 0) {
                    number_bits_set++;
                }

                current_weight = current_weight * 2;
            }
            ans[i] = number_bits_set;

        }

        return ans;

    }
}