package tryHelloworld.thread;

/**
 * test
 * ㄴ MyRunnable.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class MyRunnable implements Runnable {

	String str;
	public MyRunnable(String str){
		this.str = str;
	}

	@Override
	public void run() {
	for (int i = 0; i < 20; i++) {
		System.out.println(str);
		try {
			Thread.sleep((int) (Math.random() * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
