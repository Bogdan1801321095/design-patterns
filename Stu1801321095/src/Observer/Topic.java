package Observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {
	
	private List<Observer> subscribers;	
	private String topic;
	
	public Topic() {
		this.subscribers= new ArrayList<>();
	}

	@Override
	public void subsccride(Observer observer) {
		this.subscribers.add(observer);
		observer.setTopic(this);
	}

	@Override
	public void unsubsccride(Observer observer) {
		this.subscribers.remove(observer);

	}

	@Override
	public void notifyObserver() {
		for(Observer observer: this.subscribers ) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		// TODO Auto-generated method stub
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		this.notifyObserver();
	}

}
