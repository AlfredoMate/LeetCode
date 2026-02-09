import java.util.HashMap;

public class Solution {

    private HashMap<Node, Node> visited;

    public Solution() {
        this.visited = new HashMap<>();
    }

    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        Node copy = new Node(node.val);
        visited.put(node, copy);

        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(cloneGraph(neighbor));
        }
        return copy;
    }

}
