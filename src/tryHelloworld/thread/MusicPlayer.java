package tryHelloworld.thread;

/**
 * tryHelloworld.java.thread
 * ㄴ MusicPlayer.java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 5. 31.
 */
public class MusicPlayer extends Thread{
	int type;
	MusicBox musicBox;

	public MusicPlayer(int type, MusicBox musicBox){
		this.type = type;
		this.musicBox = musicBox;
	}

	@Override
	public void run() {

		switch (type){
			case 1 : musicBox.playMusicA(); break;
			case 2 : musicBox.playMusicB(); break;
			case 3 : musicBox.playMusicC(); break;
			default: break;
		}
	}
}
