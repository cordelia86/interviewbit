package level4.stackAndQueue;

import java.util.ArrayList;
import java.util.Stack;

/**
 * level4.stackAndQueue
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 3. 21.
 */
public class Nearest_Smaller_Element {

	public static void main(String[] args) {
		Nearest_Smaller_Element nse = new Nearest_Smaller_Element();

		ArrayList param = new ArrayList<>();
		param.add(4);
		param.add(5);
		param.add(2);
		param.add(10);
		System.out.println(nse.prevSmaller(param));
		System.out.println(nse.prevSmallerWithStack(param));
	}


	public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {

		if(arr.isEmpty()) {
			return new ArrayList<>();
		}

		ArrayList<Integer> returnArr = new ArrayList<>();

		returnArr.add(-1);

		for (int x = 1; x<arr.size(); x++){

			if(arr.get(x-1) < arr.get(x)){
				returnArr.add(arr.get(x-1));
			} else {

				for(int y=x-1; y>=0; y--){
					if(returnArr.get(y) < arr.get(x)){
						returnArr.add(returnArr.get(y));

						break;
					}
				}
			}

			if(returnArr.size() == x){
				returnArr.add(-1);
			}
		}
		return returnArr;
	}

	public ArrayList<Integer> prevSmallerWithStack(ArrayList<Integer> arr){

		ArrayList<Integer> returnArr = new ArrayList<>(arr.size());

		Stack<Integer> stack = new Stack<>();

		for(int x=0; x<arr.size(); x++){
			while(!stack.empty() && stack.peek() > arr.get(x)){
				stack.pop();
			}

			if( stack.empty() ){
				returnArr.add(-1);
			} else {
				returnArr.add(stack.peek());
			}

			stack.push(arr.get(x));
		}
		return returnArr;
	}
}
