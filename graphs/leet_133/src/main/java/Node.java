import java.util.ArrayList;
import java.util.List;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    // Constructor 1: Empty node
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    // Constructor 2: Node with value only
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    // Constructor 3: Node with value and neighbors
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
