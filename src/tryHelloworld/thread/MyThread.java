package tryHelloworld.thread;

/**
 * test
 * ㄴ MyThread.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class MyThread extends Thread {

	String str;
	StringBuffer sf;
	StringBuilder sb;

	public MyThread(String str) {
		this.str = str;
	}

	public MyThread(StringBuffer sf) {
		this.sf = sf;
	}

	public MyThread(StringBuilder sb) {
		this.sb = sb;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (str != null) {
				System.out.println(str);
			}

			if (sf != null) {
				System.out.println(sf);
			}

			if (sb != null) {
				System.out.println(sb);
			}

			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		super.run();
	}
}
