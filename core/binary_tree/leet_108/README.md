Problem: Transform sorted array into Binary Search Tree

Solution:

Key Idea --> Recursively, create the tree from top to bottom always taking each half of the array.


	node.left = transformIntoBST(array, left, middle - 1)

Time complexity: O(n). Every member of the array is computed (node created and inserted) 

Space complexity:  O(log2n). Every recursion call halfs the array.
