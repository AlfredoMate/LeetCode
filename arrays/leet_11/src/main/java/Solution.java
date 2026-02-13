
public class Solution {

    /**
     * O(n) solution
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int highest_area = 0;
        int left_index = 0;
        int right_index = height.length - 1;
        while (left_index <= right_index) {
            int area = (right_index - left_index) * (Math.min(height[left_index], height[right_index]));
            highest_area = Math.max(area, highest_area);
            if (height[left_index] < height[right_index]) {
                left_index++;
            } else {
                right_index--;

            }
        }
        return highest_area;
    }


    /**
     * Brute force solution O(n²)
     * @param height array of all the heights
     * @return maximum area contained
     */
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
