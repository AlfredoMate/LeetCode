# Merge Two Sorted Linked Lists

## 🔗 Problem Link
https://leetcode.com/problems/merge-two-sorted-lists/

---

## Approach (Quick Intuition)

- Compare nodes from both lists
- Attach the smaller one to the result
- Move that list’s pointer
- Repeat until one list ends
- Attach the remaining nodes

---

## Key Idea

- Use a moving pointer (**tail**) to build the result
- Always attach to the tail
- The head stays fixed

---

## Complexity

- **Time:** O(n + m)
- **Space:** O(1)

---

## Common Mistakes

- Using `.next != null` instead of checking the node itself
- Forgetting null checks at the start
- Attaching nodes to the head instead of the tail
- Overcomplicating the final step

---

## Memory Trick

> Compare → Attach → Move → Append rest