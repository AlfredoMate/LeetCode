import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random(42);

        int k = 500; // number of linked lists
        ListNode[] lists = new ListNode[k];

        for (int i = 0; i < k; i++) {

            int size = 100;          // nodes per list
            int value = i * 1000;    // keep lists separated in value space

            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;

            for (int j = 0; j < size; j++) {
                value += rand.nextInt(5); // keeps list sorted but slightly random

                curr.next = new ListNode(value);
                curr = curr.next;
            }

            lists[i] = dummy.next;
        }

        // Run your solution
        Solution sol = new Solution();
        ListNode result = sol.mergeKLists(lists);

        // Print first few values to verify output (avoid huge output spam)
        System.out.println("Merged result preview:");
        int count = 0;
        while (result != null && count < 50) {
            System.out.print(result.val + " ");
            result = result.next;
            count++;
        }
    }
}