package Observer;

public class TopicSubscriber implements Observer {

	private String name;
	private Observable subscribed;

	public TopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.subscribed == null) {
			System.out.println(this.getName()+" no topic set: ");
			return;
		}
		
		String newTopic = this.subscribed.getUpdate();
		System.out.println(this.getName()+" updated: "+ newTopic);

	}

	@Override
	public void setTopic(Observable topic) {
		this.subscribed = topic;

	}

	public String getName() {
		return name;
	}

}
