import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> my_set = new HashSet<>();
        for (int i : nums) {
            my_set.add(i);
        }
        int max_consecutive = 0;
        int current_consecutive = 0;
        for (int num : my_set) {
            if (!my_set.contains(num - 1)) {
                //num is the first number of a sequence
                current_consecutive = 1;
                int current_number = num;
                while(my_set.contains(current_number + 1)) {
                    current_number++;
                    current_consecutive++;
                }
                max_consecutive = Math.max(max_consecutive, current_consecutive);
            }
        }
        return max_consecutive;
    }
}
