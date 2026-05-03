import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public DataGenerator () {}

    public static ListNode buildList(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    // Generate test cases for LeetCode 23
    public static List<ListNode[]> generateTestCases() {
        List<ListNode[]> testCases = new ArrayList<>();

        // Test case 1: normal small input
        testCases.add(new ListNode[] {
                buildList(new int[]{1, 4, 5}),
                buildList(new int[]{1, 3, 4}),
                buildList(new int[]{2, 6})
        });

        // Test case 2: includes empty list
        testCases.add(new ListNode[] {
                buildList(new int[]{}),
                buildList(new int[]{1})
        });

        // Test case 3: all single elements
        testCases.add(new ListNode[] {
                buildList(new int[]{2}),
                buildList(new int[]{-1}),
                buildList(new int[]{0})
        });

        // Test case 4: larger lists
        testCases.add(new ListNode[] {
                buildList(new int[]{1,2,3,4,5}),
                buildList(new int[]{1,1,1,1}),
                buildList(new int[]{2,2,2})
        });

        // Test case 5: all empty
        testCases.add(new ListNode[] {
                buildList(new int[]{}),
                buildList(new int[]{}),
                buildList(new int[]{})
        });

        return testCases;
    }

    // Utility: print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

}
