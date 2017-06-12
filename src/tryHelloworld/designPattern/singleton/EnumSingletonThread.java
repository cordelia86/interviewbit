package tryHelloworld.designPattern.singleton;

/**
 * tryHelloworld.thread
 * ㄴ EnumSingletonThread.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class EnumSingletonThread extends Thread {

	String str;

	EnumSingletonThread(String str){
		this.str = str;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			EnumSingleton.SINGLETON.method(str);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
