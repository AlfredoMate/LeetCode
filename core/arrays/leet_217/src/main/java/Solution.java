import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> already_found = new HashSet<>();

        for (int num : nums) {
            if (already_found.contains(num)) {
                return true;
            } else {
                already_found.add(num);
            }
        }
        return  false;
    }
}