package level6;

import java.util.ArrayList;
import java.util.List;

/**
 * level6
 * ㄴ LeastCommonAncestor.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 4. 18.
 */
public class LeastCommonAncestor {

	private static List<Integer> parentNode = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode5 = new TreeNode (5);
		TreeNode treeNode1 = new TreeNode (1);
		TreeNode treeNode6 = new TreeNode(6);
		TreeNode treeNode2 = new TreeNode (2);
		TreeNode treeNode0 = new TreeNode (0);
		TreeNode treeNode8 = new TreeNode (8);
		TreeNode treeNode7 = new TreeNode (7);
		TreeNode treeNode4 = new TreeNode (4);

		TreeNode treeNode14 = new TreeNode(14);
		TreeNode treeNode39 = new TreeNode(39);
		TreeNode treeNode13 = new TreeNode(13);
		TreeNode treeNode16 = new TreeNode(16);
		TreeNode treeNode25 = new TreeNode(25);
		TreeNode treeNode11 = new TreeNode(11);
		TreeNode treeNode41 = new TreeNode(41);
		TreeNode treeNode26 = new TreeNode(26);
		TreeNode treeNode36 = new TreeNode(36);
		TreeNode treeNode23 = new TreeNode(23);
		TreeNode treeNode12 = new TreeNode(12);
		TreeNode treeNode22 = new TreeNode(22);
		TreeNode treeNode43 = new TreeNode(43);
		TreeNode treeNode28 = new TreeNode(28);
		TreeNode treeNode38 = new TreeNode(38);
		TreeNode treeNode31 = new TreeNode(31);
		TreeNode treeNode32 = new TreeNode(32);


		treeNode14.left = treeNode39;
		treeNode14.right = treeNode13;

		treeNode13.left = treeNode25;
		treeNode13.right = treeNode11;

		treeNode25.right = treeNode36;
		treeNode36.left = treeNode38;
		treeNode36.right = treeNode31;

		treeNode11.left = treeNode23;
		treeNode11.right = treeNode12;

		treeNode23.left = treeNode2;
		treeNode12.right = treeNode32;

		LeastCommonAncestor leastCommonAncestor = new LeastCommonAncestor();
		int result = leastCommonAncestor.lca(treeNode14, 31, 32);
		System.out.println(result);

	}

	public int lca(TreeNode a, int val1, int val2) {

		List<Integer> val1ParentNode = new ArrayList<>();
		List<Integer> val2ParentNode = new ArrayList<>();

		if ( !existValueInTreeNode(a, val1, val1ParentNode) || !existValueInTreeNode(a, val2, val2ParentNode)) {
			return -1;
		}

		int depth = 0;
		int val1ParentSize = val1ParentNode.size();
		int val2ParentSize = val2ParentNode.size();

		if(val1ParentSize <= val2ParentSize){
			depth = val1ParentSize;
			//System.out.println(val2ParentNode);
		}


		for (int i = 0; i < depth; i++) {
			if(val1ParentNode.get(i) == val2ParentNode.get(i)){
				return val1ParentNode.get(i);
			}
		}

		return -1;
	}

	private boolean existValueInTreeNode(TreeNode treeNode, int value, List<Integer> parentNodeList) {

		if(treeNode.val == value){
			parentNodeList.add(treeNode.val);
			return true;
		}

		if (treeNode.left != null) {
			if(existValueInTreeNode(treeNode.left, value, parentNodeList)) {
				parentNodeList.add(treeNode.val);
				return true;
			}
		}

		if (treeNode.right != null ) {
			if(existValueInTreeNode(treeNode.right, value, parentNodeList)) {
				parentNodeList.add(treeNode.val);
				return true;
			}
		}

		return false;
	}


	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

	}

}
