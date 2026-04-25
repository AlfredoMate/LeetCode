# 20. Valid Parentheses
(https://leetcode.com/problems/valid-parentheses/)

**Difficulty:** Easy

---

## **Idea**
Stack + hashmap

---

## **Approach**
- Opening → push
- Closing → check top + pop
- Mismatch / empty → false
- End → stack empty

---

## **Time:** O(n)
## **Space:** O(n)

---

## **Pattern**
`push open → match & pop → empty at end`