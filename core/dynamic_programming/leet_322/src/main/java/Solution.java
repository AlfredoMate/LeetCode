import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] coinCombinations = new int[amount + 1];
        Arrays.fill(coinCombinations, amount + 1);

        coinCombinations[0] = 0;
        for (int i = 1; i < coinCombinations.length; i++) {
            for (int coin : coins) {

                if (i-coin >= 0) {
                    coinCombinations[i] = Math.min(coinCombinations[i], coinCombinations[i-coin] + 1);
                }

            }
        }

        return coinCombinations[amount] == amount + 1 ? -1 : coinCombinations[amount];
    }
}