import java.util.*;

class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        dfs(1, 0, n, k, path);
        return res;
    }

    private void dfs (int index, int depth, int n, int k, List<Integer> path) {
        if (depth == k) {            res.add(new ArrayList<>(path));

            return;
        }

        for (int i = index; i <= n; i++) {
            path.add(i);
            depth++;
            dfs(index + 1, depth, n, k, path);
            index = index + 1;
            depth--;                                     //backtrack begins
            path.removeLast();

        }


    }
}