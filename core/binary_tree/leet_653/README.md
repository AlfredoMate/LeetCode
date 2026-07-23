Problem: two-sum Binary Search Tree

Solution:

Class variable set to keep al already seen values.

For each value we compute the value need for two-sum and check if it exists in the set. If it exists we return true.

If it does not exist, we add current value into the set and repeat process for left and right subtree. If either left or right return true, we retun true.

Time complexity: O(n) In worst case, we check every node

Space complexity: O(log2n) I normal/balanced tree. O(n). In skewed tree where two sum appears in last 2 nodes.
