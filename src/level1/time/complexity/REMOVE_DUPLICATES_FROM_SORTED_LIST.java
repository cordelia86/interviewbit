package level1.time.complexity;

/**
 * level1.time.complexity
 * ㄴ REMOVE_DUPLICATES_FROM_SORTED_LIST.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 2. 16.
 */
public class REMOVE_DUPLICATES_FROM_SORTED_LIST {

	public static void main(String[] args) {

	}

	public ListNode deleteDuplicates(ListNode a) {
		process(a);
		return a;
	}

	public void process(ListNode a){

		if(a == null){
			return;
		}


		while(a.next != null && a.val == a.next.val) {
			a.next = a.next.next;
		}

		process(a.next);
	}


	class ListNode {
		public int val;
		public ListNode next;
		ListNode(int x) { val = x; next = null;}
	}
}
