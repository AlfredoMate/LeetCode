## 141. Linked List Cycle

Link: https://leetcode.com/problems/linked-list-cycle/description/

-------------------------
### Difficulty : Easy

### Approach

- We use Floyd Cyvle Detection. Fast (fast = current.next.next) and slow pointer (slow = current.next)
- We continue until fast == slow. If fast reaches slow pointer it means we are in a cycle.
- If we encounter fast == null or fast.next == null we have reached the end of the LinkedList so we are not in a cycle.

### Time complexity

O (n). We need to travel the arrayList.

### Space complexity

O(1). We only need a few variables.