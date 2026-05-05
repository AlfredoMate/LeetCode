public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int minSeconds = 0;
        for (int i = 0; i < points.length - 1; i++) {
            minSeconds += minDistance(points[i], points[i+1]);
        }

        return minSeconds;
    }

    // Chebyshev distance (diagonals allowed)
    private int minDistance (int[] pointA, int[] pointB) {
        return (Math.max(Math.abs(pointA[0] - pointB[0]), Math.abs(pointA[1] - pointB[1])));
    }
}
