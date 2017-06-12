package tryHelloworld.designPattern.observer;

/**
 * tryHelloworld.designPattern.observer
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class ObserverPatternDemo {

	/**
	 *
	 * In Observer design pattern, the Subjects and Observers are loosely coupled.
	 * Because of this, changes to subjects and observers are independent of each other.
	 * Also, we can add or remove observers any time without impacting the Subjects.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		ColorfulSubject colorfulSubject = new ColorfulSubject();

		MyObserverOne mo1 = new MyObserverOne();
		MyObserverTwo mo2 = new MyObserverTwo();

		colorfulSubject.addObserver(mo1);
		colorfulSubject.addObserver(mo2);

		colorfulSubject.setColorMonitored("blue");
		colorfulSubject.setColorMonitored("yellow");

	}
}
