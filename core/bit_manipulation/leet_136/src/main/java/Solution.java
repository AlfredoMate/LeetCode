import java.util.*;

class Solution {


    public int singleNumber(int[] nums) {
        int previousNUmber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            previousNUmber = previousNUmber ^ nums[i];
        }
        return previousNUmber;
    }

    public int singleNumberLinearSpaceComplexity(int[] nums) {
        HashMap<Integer, Integer> numberCounter = new HashMap<>();
        for (int num : nums) {
            if (!numberCounter.containsKey(num)) {
                numberCounter.put(num, 1);
            } else {
                numberCounter.put(num, 2);
            }

        }

        for (Map.Entry<Integer, Integer> entry : numberCounter.entrySet()) {
            if (Objects.equals(1, entry.getValue())) {
                return entry.getKey();
            }
        }
        return 0;
    }
}