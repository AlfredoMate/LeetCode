import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> path = new ArrayList<>();
        dfs(path, nums, 0);
        return result;
    }

    private void dfs (List<Integer> path, int[] nums, int index) {

        result.add(new ArrayList<>(path));
        if (path.size() == nums.length) {
            return;
        }


        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(path, nums, i + 1);
            path.removeLast();
        }

    }
}