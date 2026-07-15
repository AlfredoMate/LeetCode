import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;

class Solution {

	public boolean isSameTree(TreeNode p, TreeNode q) {
				
		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		}	

		boolean equalLeft = isSameTree(p.left, q.left);
		boolean equalRight = isSameTree(p.right, q.right);

		if (p.val == q.val && equalLeft && equalRight) {
			return true;
		} else {
			return false;
		}
 	
	}
}
