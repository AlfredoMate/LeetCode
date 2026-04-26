public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode pointerList1 = list1;
        ListNode pointerList2 = list2;
        ListNode ordered_list;
        ListNode pointer_ordered;

        if (list1.val <= list2.val) {
            ordered_list = list1;
            pointerList1 = pointerList1.next;
        } else {
            ordered_list = list2;
            pointerList2 = pointerList2.next;
        }
        pointer_ordered = ordered_list;

        while (pointerList1 != null && pointerList2 != null) {
            if (pointerList1.val <= pointerList2.val) {
                pointer_ordered.next = pointerList1;
                pointer_ordered = pointer_ordered.next;
                pointerList1 = pointerList1.next;
            } else {
                pointer_ordered.next = pointerList2;
                pointer_ordered = pointer_ordered.next;
                pointerList2 = pointerList2.next;
            }
        }
        pointer_ordered.next = pointerList1 == null ? pointerList2 : pointerList1;

        return ordered_list;
    }
}