import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min_distance = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            min_distance = Math.min(min_distance, Math.abs(arr[i+1] - arr[i]));
        }


        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i+1] - arr[i]) == min_distance) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                result.add(pair);
            }
        }
        return result;

    }
}