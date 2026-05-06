import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int numIslands(char[][] grid) {

        int total_islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(i, j, grid);
                    total_islands++;
                }
            }
        }
        return total_islands;
    }

    private void bfs (int x, int y, char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        grid[x][y] = '0';
        while (!queue.isEmpty()) {
            int[] current_position = queue.poll();

            // down
            if (current_position[0] + 1 < grid.length && grid[current_position[0] + 1][current_position[1]] == '1') {
                queue.offer(new int[]{current_position[0] + 1, current_position[1]});
                grid[current_position[0] + 1][current_position[1]] = '0';
            }
            // right
            if (current_position[1] + 1 < grid[0].length && grid[current_position[0]][current_position[1] + 1] == '1') {
                queue.offer(new int[]{current_position[0], current_position[1] + 1});
                grid[current_position[0]][current_position[1] + 1] = '0';
            }

            // left
            if (current_position[1] - 1 >= 0 && grid[current_position[0]][current_position[1] - 1] == '1') {
                queue.offer(new int[]{current_position[0], current_position[1] - 1});
                grid[current_position[0]][current_position[1] - 1] = '0';
            }

            // up
            if (current_position[0] - 1 >= 0 && grid[current_position[0] - 1][current_position[1]] == '1') {
                queue.offer(new int[]{current_position[0] - 1, current_position[1]});
                grid[current_position[0] - 1][current_position[1]] = '0';
            }
        }
    }
}