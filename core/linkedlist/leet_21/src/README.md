Problem: Merge two sorted list

Solution:

We take the smallest of the first 2 elements of both list. We add the smallest to tail.next.

Tail is the node we use to keep track of the merged list.

Time complexity: O(n + m) Each node from both lists is processed once.

Space complexity: O(1)