Problem: Reverse list between index left and right

Solution:

We move pointer to previous to left index. For right-left times we perform:



ListNode next = curr.next;

curr.next = next.next;

next.next = prev.next;

prev.next = next;

Time complexity: O(n)
Space complexity: O(1)