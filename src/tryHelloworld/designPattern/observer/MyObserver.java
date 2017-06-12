package tryHelloworld.designPattern.observer;

/**
 * tryHelloworld.designPattern.observer
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public abstract class MyObserver {

	public void update(String color){
		System.out.println("[" + this.getClass().getSimpleName() + "] notified and updated for color " + color );
	}
}
