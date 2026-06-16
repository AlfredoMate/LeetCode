public class Main {

    public static void main (String[] args) {
        ListNode node4 = new ListNode(1, null);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node6 = new ListNode(2, null);
        ListNode node5 = new ListNode(1, node6);

        Solution solution = new Solution();
        System.out.println("Test 1 (should be true): " + solution.isPalindrome(node1));
        System.out.println("Test 2 (should be false): " + solution.isPalindrome(node5));

    }
}
