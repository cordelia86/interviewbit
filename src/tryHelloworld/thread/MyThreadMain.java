package tryHelloworld.thread;

/**
 * test
 * ㄴ MyThreadMain.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class MyThreadMain {

	public static void main(String[] args) {
//		MyThread myThread1 = new MyThread("Thread1 TEst!!!!!!!!!!!!!!!");
//		MyThread myThread2 = new MyThread("Thread2 TEst!!!!!!!!!!!!!!!");
//		myThread1.start();
//		myThread2.start();


		String str = new String("String");
		MyRunnable myRunnable1 = new MyRunnable(str);
		MyRunnable myRunnable2 = new MyRunnable(str + " 2");

		Thread thread1 = new Thread(myRunnable1);
		thread1.start();
		Thread thread2 = new Thread(myRunnable2);
		thread2.start();

		StringBuffer sf = new StringBuffer("String Buffer");
		MyThread myThread1 = new MyThread(sf);
		myThread1.start();
		MyThread myThread2 = new MyThread(sf.append(" 2"));
		myThread2.start();
		sf.append(" 3");
		sf.deleteCharAt(0);


		StringBuilder sb = new StringBuilder("String Builder");
		MyThread myThread3 = new MyThread(sb);
		myThread3.start();
		MyThread myThread4 = new MyThread(sb);
		myThread4.start();
		sb.append(" 3");
		sb.deleteCharAt(0);
		sb.append(" 2");

	}
}
