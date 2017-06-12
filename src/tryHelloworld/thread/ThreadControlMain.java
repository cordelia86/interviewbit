package tryHelloworld.thread;

/**
 * tryHelloworld.java.thread
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class ThreadControlMain {
	public static void main(String[] args) {
		ThreadControl threadControl = new ThreadControl();

		threadControl.start();

		synchronized (threadControl) {
			try {
				System.out.println("완료될때까지 기다림~~");
				threadControl.wait();
			} catch(InterruptedException ex){
				ex.printStackTrace();
			}
			System.out.println("Total is " + threadControl.total);
		}
	}
}
