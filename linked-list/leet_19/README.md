# 19. Remove Nth Node From End of List
(https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

**Difficulty:** Medium

---

## **Idea**
Two pointers with a fixed gap using a dummy node.

---

## **Approach**
- Add a dummy before head
- Move `fast` **n + 1 steps**
- Move `fast` and `slow` together
- Remove `slow.next`

---

## **Key Insight**
- Maintain a gap of **n nodes**
- When `fast == null`, `slow` is right before the target
- Dummy removes edge case (deleting head)

---

## **Pattern**
`fast n+1 → move both → delete slow.next`