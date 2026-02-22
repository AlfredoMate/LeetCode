## 15. 3Sum

Link: https://leetcode.com/problems/3sum/description/

---

### Difficulty : Medium

### Approach
- Sort the array.
- For each element, use two pointers to find pairs summing to zero.
- Skip duplicates to avoid repeated triplets.

### Time complexity
- O(n²)

### Space complexity
- O(n²) for output, otherwise O(1)