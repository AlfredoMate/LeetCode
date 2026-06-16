class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        //Find middle of the list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //We reverse the second half of the list

        ListNode secondHalfHead = reverseList(slow);

        //Iteration to test if list is palindrome

        while (head != null && secondHalfHead != null) {
            if (head.val != secondHalfHead.val) {
                return false;
            }
            head = head.next;
            secondHalfHead = secondHalfHead.next;
        }
        return true;


    }

    private ListNode reverseList(ListNode head_half) {
        ListNode prev = null;
        ListNode curr = head_half;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}