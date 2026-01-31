## Two sum (1)

Link: https://leetcode.com/problems/two-sum/description/

-------------------------
### Difficulty : Easy

### Approach

We cannot sort the array as we would lose track of original indexes.

- For every element in the array, store the following information in a HashMap:
  - key : complement (target - element). Value needed to reach target.
  - value : index of element
- Check if current element exists as a key in the hashmap. If it does, we return current element index and value of the hashmap (index of the other value needed to reach target)

### Time complexity

O(n). We only travel the array once. We do some work for every element of the array only once.

### Space complexity

O(n). Hashmap created.