## 268. Missing Number

Link: https://leetcode.com/problems/missing-number/description/

-------------------------
### Difficulty : Easy

### Approach

- Range [0, n] with n non-repeating numbers implies one missing number.
- We calculate 1 + 2 + 3 + ... + n = (n * (n + 1)) / 2
- We calculate the input array sum with O(n)
- We return the difference, which is the missing number.

## Time complexity

O(n). We only visit each element once.

## Space complexity

O(1). Only some variables are used