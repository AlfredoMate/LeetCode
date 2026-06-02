Problem: maximum subarray

Solution: double pointer + dynamic programming
Iterate over all array and forget about the previous subarray sum if it is smaller than current number.

Time complexity = O(n)
Space complexity = O(1)