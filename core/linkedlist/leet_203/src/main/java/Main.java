public class Main {

    public static void main (String[] args) {

        ListNode node7 = new ListNode(6, null);
        ListNode node6 = new ListNode(5, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(6, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(6, node2);



        Solution solution = new Solution();
        ListNode listFiltered = solution.removeElements(node1, 6);
        while (listFiltered != null) {
            System.out.println(listFiltered.val);
            listFiltered = listFiltered.next;
        }
    }
}
