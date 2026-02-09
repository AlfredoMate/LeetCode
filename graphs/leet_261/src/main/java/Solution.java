import java.awt.*;
import java.util.*;
import java.util.List;

public class Solution {

    private Set<Integer> visited = new HashSet<>();

    public Solution () {
        this.visited = new HashSet<>();
    }

    public boolean validTree(int n, int[][] edges) {

        if (edges.length != n - 1) {
            return false;
        }

        List<List<Integer>> adjacentNodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacentNodes.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int edge_a = edge[0];
            int edge_b = edge[1];
            adjacentNodes.get(edge_a).add(edge_b);
            adjacentNodes.get(edge_b).add(edge_a);
        }
        boolean result =  dfs(0, -1, adjacentNodes);

        //Tree must be one component
        if (visited.size() != n) {
            return false;
        }
        return result;

    }

    private boolean dfs (int node, int parent, List<List<Integer>> adjacentNodes) {
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        for (Integer children : adjacentNodes.get(node)) {
            if (children != parent) continue;
            if (!dfs(children, node, adjacentNodes)) {
                return false;
            }
        }
        return true;
    }

}
