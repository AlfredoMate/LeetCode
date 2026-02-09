public class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();

        // ----------------------
        // TEST 1: Valid Tree
        // ----------------------
        int n1 = 5;
        int[][] edges1 = {
                {0,1},
                {0,2},
                {0,3},
                {1,4}
        };

        System.out.println("Test 1 Expected: true");
        System.out.println(sol.validTree(n1, edges1));


        // ----------------------
        // TEST 2: Cycle Exists
        // ----------------------
        int n2 = 5;
        int[][] edges2 = {
                {0,1},
                {1,2},
                {2,3},
                {1,3},
                {1,4}
        };

        System.out.println("Test 2 Expected: false");
        System.out.println(sol.validTree(n2, edges2));


        // ----------------------
        // TEST 3: Disconnected
        // ----------------------
        int n3 = 4;
        int[][] edges3 = {
                {0,1},
                {2,3}
        };

        System.out.println("Test 3 Expected: false");
        System.out.println(sol.validTree(n3, edges3));
    }
}
