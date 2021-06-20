package Observer;

public class ObserverMain {

	public static void main(String[] args) {
		Topic topic= new Topic();
		
		Observer observ1 = new TopicSubscriber("observer1");
		Observer observ2 = new TopicSubscriber("observer2");
		Observer observ3 = new TopicSubscriber("observer3");
		
		topic.subsccride(observ1);
		topic.subsccride(observ2);
		topic.subsccride(observ3);
		
		topic.setTopic("Topic is set1");
		topic.setTopic("Topic is set2");

	}

}

