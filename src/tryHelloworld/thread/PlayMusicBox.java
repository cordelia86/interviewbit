package tryHelloworld.thread;

/**
 * tryHelloworld.java.thread
 * ㄴ PlayMusicBox.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class PlayMusicBox {
	public static void main(String[] args) {
		MusicBox musicBox = new MusicBox();
		MusicPlayer musicPlayer1 = new MusicPlayer(1, musicBox);
		MusicPlayer musicPlayer2 = new MusicPlayer(2, musicBox);
		MusicPlayer musicPlayer3 = new MusicPlayer(3, musicBox);

		System.out.println("Start!!");

		musicPlayer1.start();
		musicPlayer2.start();
		musicPlayer3.start();

		try {
			musicPlayer1.join();
			musicPlayer2.join();
			musicPlayer3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End!!!!!");
	}
}
