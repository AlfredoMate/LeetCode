## 139. Word Break

Link: https://leetcode.com/problems/word-break/description/

-------------------------
### Difficulty : Medium

### Approach

- We use dynamic programming (bottom-up approach). 
- We create a boolean array to keep track to where we can arrive with dict words.
- If boolean_array[i] == true and we can get from i to current string position with a dictionary word, we mark in the array we can reach that position. 

## Time complexity

- O(n²). Important to note that the dictionary must be converted to a set for O(1) look up time for every seach.

## Space complexity
- O(n). Array created to keep track.
