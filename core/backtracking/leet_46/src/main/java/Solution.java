import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length + 1];
        dfs(nums, new ArrayList<>(), used);
        return res;
    }

    private void dfs (int[] nums, ArrayList<Integer> path, boolean[] used) {

        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            path.add(nums[i]);
            used[i] = true;
            dfs(nums, path, used);
            used[i] = false;                            //backtracking begins
            path.removeLast();

        }
    }
}