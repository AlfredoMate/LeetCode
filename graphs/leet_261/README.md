## 261. Graph Valid Tree

Link: https://leetcode.com/problems/graph-valid-tree/

-------------------------
### Difficulty : Medium

### Approach

- A graph is a valid tree if it is **fully connected** and contains **no cycles**.
- First, check if the number of edges equals `n - 1`.
    - If not, the graph cannot be a tree. Fewer edges → disconnected, more edges → cycle exists.
- Build an adjacency list from the edge list to represent the graph.
- Use DFS to traverse the graph starting from node `0`:
    - Keep track of visited nodes in a `HashSet`.
    - Track the parent node to prevent falsely detecting cycles when revisiting the node we came from.
    - If a node is visited that is **not the parent**, a cycle exists → return false.
- After DFS, check that all nodes were visited to ensure the graph is connected.

### Time complexity

O(V + E)
- V = number of nodes
- E = number of edges
- Each node and edge is visited exactly once in DFS.

### Space complexity

O(V)
- HashSet stores visited nodes
- Recursion stack in DFS can go up to O(V)
