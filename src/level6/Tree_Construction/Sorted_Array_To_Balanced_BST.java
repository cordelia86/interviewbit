package level6.Tree_Construction;

import java.util.Arrays;
import java.util.List;

/**
 * level6.Tree_Construction
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 12.
 */
public class Sorted_Array_To_Balanced_BST {
	public static void main(String[] args) {

		Sorted_Array_To_Balanced_BST satbb = new Sorted_Array_To_Balanced_BST();

		float result = (float)7/2;
		System.out.println(Math.ceil(result));
		TreeNode treeNode = satbb.sortedArrayToBST(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		System.out.println(treeNode);
	}

	public TreeNode sortedArrayToBST(final List<Integer> a) {

		if(a.isEmpty()){
			return null;
		}

		if(a.size() == 1){
			return new TreeNode(a.get(0));
		}

		return makeSubTree(a);
	}

	public TreeNode makeSubTree(List<Integer> list){

		if(list == null || list.isEmpty()){
			return null;
		}

		if(list.size() == 1){
			return new TreeNode(list.get(0));
		}

		int index =  (int)Math.floor((float)list.size()/2);
		TreeNode root = new TreeNode(list.get(index));

		TreeNode left;
		TreeNode right;

		if( list.size() == 3){
			left = new TreeNode(list.get(index - 1));
			right = new TreeNode(list.get(index + 1));
		} else {
			left = makeSubTree(list.subList(0, index));
			right = makeSubTree(list.subList(index + 1, list.size()));
		}


		root.left = left;
		root.right = right;

		return root;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
