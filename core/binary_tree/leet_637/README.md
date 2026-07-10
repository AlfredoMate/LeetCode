Problem: Average of levels in Binary Tree

Solution:

We want to traverse the tree level by level, so we use breadth first search logic.

We use a queue to store nodes we are visiting. We use a queue because we need LIFO logic to compute first the same level nodes.

We don't need recursion.

1. while queue is not empty
2. we remove and compute all nodes of level (queue.size() times before the insertion of any children node)
3. for every node, we insert its children of the queue (if not null)
4. once all nodes of level are done, we repeat with next node

Time complexity: O(n); n = number of nodes

Space complexity: O(n): n = number of nodes (queue strcuture). Worst case scenario where w (max width) = n (node number) --> very wide tree 
