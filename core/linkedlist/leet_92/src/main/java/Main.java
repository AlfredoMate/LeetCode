public class Main {

    public static void main (String[] args) {

        final int LEFT = 2;
        final int RIGHT = 4;

        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node6 = new ListNode(5, null);

        Solution solution = new Solution();



        ListNode partialReversedHead = solution.reverseBetween(node1, LEFT, RIGHT);

        while (partialReversedHead != null) {
            System.out.println(partialReversedHead.val);
            partialReversedHead = partialReversedHead.next;
        }
    }
}
