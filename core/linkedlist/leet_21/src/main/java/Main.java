public class Main {
    public static void main (String[] args) {

        ListNode node31 = new ListNode(4, null);
        ListNode node21 = new ListNode(2, node31);
        ListNode node11 = new ListNode(1, node21);

        ListNode node32 = new ListNode(4, null);
        ListNode node22 = new ListNode(3, node32);
        ListNode node12 = new ListNode(1, node22);

        Solution solution = new Solution();

        ListNode headSorted = solution.mergeTwoLists(node11, node12);
        while (headSorted != null) {
            System.out.println(headSorted.val);
            headSorted = headSorted.next;
        }

    }
}
