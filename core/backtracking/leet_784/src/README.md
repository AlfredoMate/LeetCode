Problem: Return all upper/lower case combinations of string.

Solution: DFS + Backtracking. When we find a non-digit character, we continue to explore both options (upper or lower)
recursively until we iterate all string.

Time complexity: 2^L * n (L = string length, String creation)
Space complexity: n (Recursion stack) Excluding output.