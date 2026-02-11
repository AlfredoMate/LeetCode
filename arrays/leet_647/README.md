## 647. Palindromic Substrings

Link: https://leetcode.com/problems/palindromic-substrings/description/

-------------------------
### Difficulty : Medium

### Approach

**Expand Around Center** technique used.

- Every palindrome has a **center**. The center can be:
    - A single character (odd-length palindrome)
    - A gap between two characters (even-length palindrome)

- For each index in the string, we treat it as a possible center and expand outward while the characters match.
- We use two pointers:
    - `left`
    - `right`

- For each index `i`, we check two cases:
    - Odd length palindrome → center at `i`
    - Even length palindrome → center between `i` and `i + 1`

- While characters at `left` and `right` match:
    - We count a palindrome substring
    - Expand outward by moving:
        - `left--`
        - `right++`

This guarantees that all palindromic substrings are counted.

---

### Time complexity

O(n²)

- For each character in the string, we may expand across the entire string in the worst case.
- Example worst case: `"aaaaaa"`

---

### Space complexity

O(1)

- Only pointers and counters are used.
- No extra data structures required.

---



