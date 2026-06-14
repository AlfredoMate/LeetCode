Problem: Detect cycle in singly linkedlist.

Solution:

(Floyd cycle detection).

Slow/fast pointer. If slow == fast, there is a cycle. If fast == null without being equal to slow there is no cycle.

Time complexity: O(n) Time proportional no number of nodes.

Space complexity: O(1)
