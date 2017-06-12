package tryHelloworld.designPattern.singleton;

/**
 * tryHelloworld.thread
 * ㄴ BillPughSingleton.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class BillPughSingleton {

	private BillPughSingleton(){}

	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance(){

		return BillPughSingleton.getInstance();
	}
}
