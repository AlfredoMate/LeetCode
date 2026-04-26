public class Main {

    public static void main (String [] args) {


        ListNode listNode13 = new ListNode(4);
        ListNode listNode12 = new ListNode(2, listNode13);
        ListNode listNode11 = new ListNode(1, listNode12);


        ListNode listNode23 = new ListNode(4);
        ListNode listNode22 = new ListNode(3, listNode23);
        ListNode listNode21 = new ListNode(1, listNode22);

        Solution solution = new Solution();


        solution.mergeTwoLists(null, new ListNode(0));

    }
}
