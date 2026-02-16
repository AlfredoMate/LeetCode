public class Main {

    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(-4);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(3);
        
        listNode4.next = listNode2;    
        listNode3.next = listNode4;        
        listNode2.next = listNode3;        
        listNode1.next = listNode2;
        
        Solution solution = new Solution();

        System.out.println(solution.hasCycle(listNode1));
    }
}
