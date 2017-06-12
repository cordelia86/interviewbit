package tryHelloworld.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * tryHelloworld.designPattern.observer
 * ㄴ .java
 *
 * @author Boram Lee(1100230)
 * @since 2017. 6. 12.
 */
public class ColorfulSubject implements Subject {

	private List<MyObserver> observers;

	private String colorMonitored;

	public ColorfulSubject() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(MyObserver myObserver) {
		observers.add(myObserver);
	}

	@Override
	public void removeObserver(MyObserver myObserver) {
		observers.remove(myObserver);
	}

	@Override
	public void notifyObserver() {
		for (MyObserver observer : observers) {
			observer.update(colorMonitored);
		}
	}

	public void setColorMonitored(String colorMonitored){
		this.colorMonitored = colorMonitored;
		notifyObserver();
	}

	public String getColorMonitored(){
		return this.colorMonitored;
	}
}
