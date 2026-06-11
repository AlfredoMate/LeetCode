Problem: Permutations

Solution:

DFS Backtracking with boolean[] used and for loop controlling recursion (permutation).

As it's not combinations (order doesn't matter), we don't need to keep track of where are we in the array with an index.

Time complexity: 2^n! * n (n! leafs in recurssion tree)
Space complexity: n (recursion stack)