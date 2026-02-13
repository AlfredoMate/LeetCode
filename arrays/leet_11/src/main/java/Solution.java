/**
 * Brute force solution O(n²)
 */
public class Solution {
    public int maxAreaBruteForce(int[] height) {

        int max_area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                max_area = Math.max(max_area, (j-i) * (Math.min(height[i], height[j])));
            }
        }
        return max_area;
    }
}
