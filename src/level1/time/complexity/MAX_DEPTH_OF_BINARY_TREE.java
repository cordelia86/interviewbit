package level1.time.complexity;

/**
 * level1.time.complexity
 * ㄴ MAX_DEPTH_OF_BINARY_TREE.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 2. 14.
 */
public class MAX_DEPTH_OF_BINARY_TREE {
	public static void main(String[] args) {
		TreeNode treenode;
	}

	public int maxDepth(TreeNode A) {
		return depth(A, 0);
	}

	public int depth(TreeNode node, int level) {

		if (node == null)
			return level;

		int left = depth(node.left, level + 1);
		int right = depth(node.right, level + 1);

		return Math.max(left, right);

	}

	class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.value = x;
		}
	}
}
