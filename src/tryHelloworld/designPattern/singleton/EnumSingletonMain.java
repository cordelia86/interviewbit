package tryHelloworld.designPattern.singleton;

/**
 * tryHelloworld.thread
 * ㄴ EnumSingletonMain.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class EnumSingletonMain {
	public static void main(String[] args) {

		EnumSingletonThread thread1 = new EnumSingletonThread("A");
		EnumSingletonThread thread2 = new EnumSingletonThread("B");
		thread1.run();
		thread2.run();
	}
}
