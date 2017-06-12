package tryHelloworld.thread;

/**
 * tryHelloworld.thread
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class DaemonThread implements Runnable {

	@Override
	public void run() {

		while(true){
			System.out.println("Daemon Thread가 실행중입니다.");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {

		Thread thread = new Thread(new DaemonThread());

		thread.setDaemon(true);
		thread.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello i : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
