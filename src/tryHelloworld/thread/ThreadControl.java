package tryHelloworld.thread;

/**
 * tryHelloworld.java.thread
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class ThreadControl extends Thread{

	int total;

	@Override
	public void run() {
		synchronized (this){
			for (int i = 0; i < 5; i++) {

				System.out.println(i+"를 더합니다.");
				total += i;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			notify();
		}
	}
}
