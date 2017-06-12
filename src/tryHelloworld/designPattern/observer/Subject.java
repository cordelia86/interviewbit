package tryHelloworld.designPattern.observer;

/**
 * tryHelloworld.designPattern.observer
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public interface Subject {

	void addObserver(MyObserver observer);

	void removeObserver(MyObserver observer);

	void notifyObserver();
}
