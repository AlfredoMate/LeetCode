## 3. Longest Substring Without Repeating Characters

Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

-------------------------
### Difficulty : Easy

### Approach

**Sliding window** technique used.

- We move window through the string with the objective of keeping different characters inside the window. We keep
of current different characters in a set.
- We have 2 pointers, left and right. We advance right pointer and process character, with 2 possible options:
  - If character is different, we add it to the set and advance right pointer.
  - If character is already in the set, it makes current window not to be a valid substring of different characters. We eliminate character from set and advance left pointer. We repeate this process until duplicate character is removed from the set.


### Time complexity

O(n). Each character is processed (added and removed) at most once.

### Space complexity

O(n). Hashmap created. In worst case scenario, with all string with unique characters.