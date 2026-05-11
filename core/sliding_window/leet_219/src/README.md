Problem: find two equal numbers inside a range k in an array

Solution:

Sliding window of k length with a hashSet to keep track of numbers inside window.

Time: O(N)
Space: O(min(n,k))