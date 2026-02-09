## 133. Clone Graph

Link: https://leetcode.com/problems/clone-graph/description/

-------------------------
### Difficulty : Medium

### Approach

- We use a HashMap to keep track of what nodes have already been used. This is essential to avoid infinit loops.
- We use DFS to traverse the graph. For each node:
    - Create a copy of it if not created already (not existing in hashmap)
    - Recursively create copies (if necessary) of all neighbors and attach to them to the original node.

### Time complexity

O(V + E)

### Space complexity

O(V)