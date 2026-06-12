public class Main {

    public static void main (String[] args) {


        ListNode node_6 = new ListNode(6);
        ListNode node_5 = new ListNode(5, node_6);
        ListNode node_4 = new ListNode(4, node_5);
        ListNode node_3 = new ListNode(3, node_4);
        ListNode node_2 = new ListNode(2, node_3);
        ListNode node_1 = new ListNode(1, node_2);

        Solution solution = new Solution();
        System.out.println(solution.middleNode(node_1).val);
    }
}
