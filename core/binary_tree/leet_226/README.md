Problem: Invert binary tree

Solution: 

Each recursive function inverts left part and right part and returns root

Time complexity: O(n) All nodes are visited
Space complexity:
	- Normal/balanced tree: O(log2n)
	- Worst case/skewed tree: O(n) height is equal to total number of nodes in tree
