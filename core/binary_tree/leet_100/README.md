Solution: Given the root of 2 binary trees, check if they are identical

Problem: We traverse both binary tree using BFS (recursive approach)

At any given node, 3 conditions must be true for both trees to be identical:

	1. Left part of the tree identical
	2. Right part of the tree identical
	3. Both node value must be the same

Time complexity: O(n) we compute on all nodes

Space complexity: Worst case scenario (skewed tree) O(n) n call stacks.



