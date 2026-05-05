import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> spiralOrderV1(int[][] matrix) {
        int[] current_position = new int[] {0,0};
        HashSet<Integer> visited_positions = new HashSet<>();
        int[][] directions = new int[][] {
                {1, 0},  //right
                {0, 1}, //down
                {-1, 0}, //left
                {0, -1}  //up
        };
        int current_direction = 0; //we begin heading towards the right
        List<Integer> result = new ArrayList<>();

        int total_numbers = matrix.length * matrix[0].length;

        while (visited_positions.size() < total_numbers) {

            result.add(matrix[current_position[1]][current_position[0]]);
            visited_positions.add(current_position[0] * 10 + current_position[1]);


            int temp_current_position_x = current_position[0] + directions[current_direction][0];
            int temp_current_position_y = current_position[1] + directions[current_direction][1];

            if (temp_current_position_x >= matrix[0].length
                    || temp_current_position_y >= matrix.length
                    || temp_current_position_x < 0
                    || temp_current_position_y < 0
                    || visited_positions.contains(temp_current_position_x * 10 + temp_current_position_y)) {

                current_direction = (current_direction + 1) % 4;
                current_position[0] = current_position[0] + directions[current_direction][0];
                current_position[1] = current_position[1] + directions[current_direction][1];
            } else {
                current_position[0] = temp_current_position_x;
                current_position[1] = temp_current_position_y;
            }

        }
        return result;
    }

    public List<Integer> spiralOrderV2(int[][] matrix) {

        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int left = 0;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {


            // left --> right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }

            top++;

            //top --> bottom
            for (int j = top; j <= bottom; j++) {
                result.add(matrix[j][right]);
            }

            right--;

            //right --> left

            if (bottom >= top) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }

                bottom--;
            }


            //bottom --> top

            if (left <= right) {
                for (int j = bottom; j >= top; j--) {
                    result.add(matrix[j][left]);
                }
            }


            left++;
        }
        return result;
    }
}