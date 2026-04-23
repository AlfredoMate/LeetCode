public class Solution {

    public ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode current1 = list1;
        ListNode current2 = list2;

        while (current1.next != null && current2.next != null) {
            if (current1.val <= current2.val) {
                ListNode tmp = current1.next;
                current1.next = current2;
                current1 = tmp;

            } else {
                ListNode tmp = current2.next;
                current2.next = current1;
                current2 = tmp;
            }
        }

        if (current1.next == null) {
            current1.next = current2.next;
        } else {
            current2.next = current1.next;
        }


        if (list1.val <= list2.val) {
            return list1;
        } else {
            return list2;
        }
    }
}
