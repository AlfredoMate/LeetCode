public class Main {

    public static void main (String args[]) {

        Solution solution = new Solution();

        ListNode node_4 = new ListNode(4);
        ListNode node_3 = new ListNode(3, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode node_1 = new ListNode(1, node_2);


        int n = 4;
        ListNode head = solution.removeNthFromEnd(node_1, n);
    }
}
