## Longest Consecutive Sequence (128)

Link: https://leetcode.com/problems/longest-consecutive-sequence/description/

-------------------------
### Difficulty : Medium

### Approach
- Create a Set with all elements of the array.
- Iterate over each element of the set
- If previous number doesn't exist, it means it is the first number in a sequence.
e.g. Current number is 7, but 6 doesn't exist in the set, 7 is the first element in a sequence.
  - Increment current sequence length until next number doesn't exist. That means we found the end of the sequence.
  - If it is the longest cosecutive secuence so far, update maximum consecutive secuence length.
  
## Time complexity

O(n). We travel through elements of the array once for converting it to a Set and another one to find the maximum sequence. O(n + n) = O(n)

The while inside the loop still maintains O(n) as we are only touching elements once. For loop for first sequence elements and while loop for non-first secuence elements.

Important: The strategy of sorting the array before finding the sequence is not valid as the time complexity of the sorting logic is > O(n)

## Space complexity

O(n)