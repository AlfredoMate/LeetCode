public class Solution {

    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null)  {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode tmp = null;

        while (second != null) {
            tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        second = prev;
        ListNode first = head;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;

            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }
}
