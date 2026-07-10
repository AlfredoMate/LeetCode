import java.util.List;
import java.util.LinkedList;
import java.util.ArrayDeque;

class Solution {

	private ArrayDeque<TreeNode> nodes = new ArrayDeque<>();

	public List<Double> averageOfLevels(TreeNode root) {
		
		return bfs(root);
	}

	private List<Double> bfs (TreeNode root) {
		
		List<Double> average_list = new LinkedList<>();
		nodes.add(root);
		int level = 0;
		while (!nodes.isEmpty()) {
			int size = nodes.size();
			long level_sum = 0;
			System.out.println("Level " + level);
			for (int i = 0; i < size; i++) {
				TreeNode node = nodes.poll();
				level_sum = level_sum + node.val;
				System.out.println("level_sum = " + level_sum);
				System.out.println(node.val + ". Level: " + level);
				
				if (node.left != null) {
					nodes.addLast(node.left);
				}

				if (node.right != null) {
					nodes.addLast(node.right);
				}

			}
			double average = level_sum / (double) size;
			System.out.println("Average of level " + level + " (" + level_sum + "/" + size + ") --> " + average);
			average_list.add(average);
			level = level + 1;
		}
		return average_list;
	}
}
