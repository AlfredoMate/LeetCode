public class Main {

    public static void main (String[] args) {

        int[][] points = new int[][]{
                {1, 1},
                {3, 4},
                {-1, 0}
        };
        Solution solution = new Solution();
        System.out.println(solution.minTimeToVisitAllPoints(points));
    }
}
