package Observer;

public interface Observable {
	void subsccride(Observer observer);
	
	void unsubsccride(Observer observer);
	
	void notifyObserver();
	
	String getUpdate();

}
