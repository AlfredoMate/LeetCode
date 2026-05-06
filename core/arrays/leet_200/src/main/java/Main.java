public class Main {

    public static void main (String[] args) {

        char[][] grid = new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        char[][] grid2 = new char[][] {
                {'1', '1'},
                {'1', '1'}
        };

        char[][] grid3 = new char[][] {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };

        char[][] grid4 = new char[][] {
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'}
        };

        Solution solution = new Solution();
        System.out.println("Num islands: " + solution.numIslands(grid4));
    }
}
