package level5.tracking;

import java.util.ArrayList;

/**
 * level5.tracking
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 4. 12.
 */
public class Pruned_Builder_Generate_All_Parentheses_II {

	private ArrayList<String> parenthesesList;

	public static void main(String[] args) {
		Pruned_Builder_Generate_All_Parentheses_II pbgaP = new Pruned_Builder_Generate_All_Parentheses_II();
		System.out.println(pbgaP.generateParenthesis(3).toString());
	}

	private ArrayList<String> generateParenthesis(int A) {

		parenthesesList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		process(sb, 0, 0, A, 0);

		return parenthesesList;
	}

	private void process(StringBuilder parenthesesStr, int lCount, int rCount, int size, int index) {

		if (lCount > size || rCount > size) {
			return;
		}

		if (rCount > lCount) {
			return;
		}

		if (index == size * 2) {
			parenthesesList.add(parenthesesStr.toString());
			return;
		}

		parenthesesStr.append('(');
		process(parenthesesStr, lCount + 1, rCount, size, index + 1);
		parenthesesStr.deleteCharAt(parenthesesStr.length() - 1);

		parenthesesStr.append(')');
		process(parenthesesStr, lCount, rCount + 1, size, index + 1);
		parenthesesStr.deleteCharAt(parenthesesStr.length() - 1);
	}

}
