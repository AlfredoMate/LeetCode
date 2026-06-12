Problem: find middle node in singly linked list

Solution:

Slow/fast pointer. Slow.next / fast.next.next until fast.next == null. At that point, slow is pointing to middle node.

Time complexity: O(n)
Space complexity: O(1)