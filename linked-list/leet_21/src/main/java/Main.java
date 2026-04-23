public class Main {

    public static void main(String[] args) {

        // Creating list1 = [1,2,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Creating list2 = [1,3,4]
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        Solution solution = new Solution();
        ListNode node_sorted =  solution.mergeTwoList(list1, list2);
        System.out.println();

    }
}
