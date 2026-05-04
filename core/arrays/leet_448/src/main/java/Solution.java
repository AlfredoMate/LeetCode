import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dissappearedNumbers = new ArrayList<>();
        HashSet<Integer> foundNumbers = new HashSet<>();

        for (int num : nums) {
            foundNumbers.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!foundNumbers.contains(i)) {
                dissappearedNumbers.add(i);
            }
        }
        return dissappearedNumbers;
    }
}