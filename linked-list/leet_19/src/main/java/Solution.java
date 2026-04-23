class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            return null;
        }

        int total_length = 1;
        ListNode pointer_current_node = head;

        while (pointer_current_node.next != null) {
            pointer_current_node = pointer_current_node.next;
            total_length++;
        }

        pointer_current_node = head;
        int position_to_remove = total_length - n;

        if (position_to_remove == 0) {
            return head.next;
        }

        for (int i = 0; i < position_to_remove - 1; i++) {
            pointer_current_node = pointer_current_node.next;
        }

        pointer_current_node.next = pointer_current_node.next.next;
        return head;
    }
}