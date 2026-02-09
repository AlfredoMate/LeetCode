## 5. Longest Palindromic Substring

Link: https://leetcode.com/problems/longest-palindromic-substring/description/

-------------------------
### Difficulty : Medium

### Approach

We cannot sort the array as we would lose track of original indexes.

- The brute force solution would be to check if the substring is a palindrome for every possible start and finish. However, that would be O(n³) as we traverse the whole array two times to traverse it with all possible start and finish  combination plus one more to check if it is palindrome.
- To reduce time complexity, we traverse the string and treat every position as a potential palindrome center. Time complexity reduces because now we only travel the string once for every potential middle and another while we iterate from the middle until the substring is not a palindrome.
- We have to do this twice, as the center of a palindrome can be unique (odd length) or double (even length)

### Time complexity

O(n²)

### Space complexity

O(1)