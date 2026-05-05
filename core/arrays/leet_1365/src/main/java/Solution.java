import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] numsSorted = nums.clone();
        Arrays.sort(numsSorted);
        HashMap<Integer, Integer> sortedValueIndex = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < numsSorted.length; i++) {
            if (!sortedValueIndex.containsKey(numsSorted[i])) {
                sortedValueIndex.put(numsSorted[i], i);
            }
        }

        for (int num : nums) {
            result.add(sortedValueIndex.get(num));
        }

        return result.stream().mapToInt(Integer :: intValue).toArray();

    }
}