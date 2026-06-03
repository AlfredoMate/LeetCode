problem: add sums in [left,right] subarray, many calls to function

Solution:

In constructor we create a prefix sum so that query is O(1) time complexity. 
Query: prefix_sum[righ + 1] - prefix_sum[left]

Time complexity: O(1) query + O(n) constructor = O(1). Query dominates as constructor is only computed once.
Space complexity: O(n)  