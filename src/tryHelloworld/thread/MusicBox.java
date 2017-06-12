package tryHelloworld.thread;

/**
 * tryHelloworld.java.thread
 * ㄴ MusicBox.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class MusicBox {

	public void playMusicA(){

		for (int i = 0; i < 5; i++) {
			synchronized (this){
				System.out.println("[Music A] 신나는 음악");
			}

			try {
				Thread.sleep((int)Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void playMusicB(){
		for (int i = 0; i < 5; i++) {
			synchronized (this){
				System.out.println("[Music B] 슬픈 음악");
			}

			try {
				Thread.sleep((int)Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void playMusicC(){
		for (int i = 0; i < 5; i++) {
			synchronized (this) {
				System.out.println("[Music C]조용한 음악");
			}

			try {
				Thread.sleep((int)Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
