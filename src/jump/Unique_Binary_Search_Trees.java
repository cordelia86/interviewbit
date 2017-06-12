package jump;

import java.util.ArrayList;
import java.util.List;

/**
 * jump
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 4. 14.
 */
public class Unique_Binary_Search_Trees {

	private static int count = 0;

	public static void main(String[] args) {
		Unique_Binary_Search_Trees uniqueBinarySearchTrees = new Unique_Binary_Search_Trees();
		uniqueBinarySearchTrees.generateTrees(4);
	}

	public ArrayList<TreeNode> generateTrees(int a) {

		ArrayList<TreeNode> treeNodeArrayList = new ArrayList<>();
		List<TreeNode> nodeList = new ArrayList<>();

		for (int i = 1; i <= a; i++) {
			nodeList.add(new TreeNode(i));
		}

		int size = nodeList.size();

		for (int i = 0; i < size; i++) {
			makeTree(nodeList, nodeList.get(i), treeNodeArrayList, a, 1);
		}

		return treeNodeArrayList;
	}

	private TreeNode makeTree(List<TreeNode> numberList, TreeNode currentNode, ArrayList<TreeNode> treeNodeArrayList, int totalNodeCnt, int count) {

		if (numberList.isEmpty()) {
			return currentNode;
		}

		List<TreeNode> leftList = new ArrayList<>();
		List<TreeNode> rightList = new ArrayList<>();

		numberList.forEach(number -> {
			if (currentNode.val < number.val) {
				rightList.add(number);
			} else if (currentNode.val > number.val) {
				leftList.add(number);
			}
		});

		if (rightList.isEmpty() && leftList.isEmpty()) {
			return currentNode;
		}

		TreeNode copyTreeNode = new TreeNode(currentNode.val);
		copyTreeNode.left = currentNode.left;
		copyTreeNode.right = currentNode.right;

		if (!leftList.isEmpty()) {
			for (int i = 0; i < leftList.size(); i++) {
				copyTreeNode.left = makeTree(leftList, leftList.get(i), treeNodeArrayList, totalNodeCnt, ++count);

				if (leftList.size() == totalNodeCnt - 1) {
				treeNodeArrayList.add(copyTreeNode);
				copyTreeNode = new TreeNode(currentNode.val);
				copyTreeNode.left = currentNode.left;
				copyTreeNode.right = currentNode.right;
				}
			}
		}

		if (!rightList.isEmpty()) {
			for (int i = 0; i < rightList.size(); i++) {
				copyTreeNode.right = makeTree(rightList, rightList.get(i), treeNodeArrayList, totalNodeCnt, ++count);

				if (leftList.size() + rightList.size() == totalNodeCnt - 1) {
					treeNodeArrayList.add(copyTreeNode);
					copyTreeNode = new TreeNode(currentNode.val);
					copyTreeNode.left = currentNode.left;
					copyTreeNode.right = currentNode.right;
				}
			}
		}
		return copyTreeNode;
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
