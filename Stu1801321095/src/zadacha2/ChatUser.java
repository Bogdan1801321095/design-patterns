package zadacha2;

public class ChatUser extends User {
    static int a=0;
	
	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		if(message.equals("addBot")) {
			a=1;
			
			Singleton sing = Singleton.getInstance();
			sing.postMessage(this.name+" add Bot");
		}else {
			if(a==1) {
				if(message.equals("cat")) {
					Singleton sing = Singleton.getInstance();
					sing.postMessage("User "+this.name+" delited, because "+ message+ " is e forbidden word");
				}else {
					System.out.println(this.name + " sends: " + message);
					this.mediator.sendMessage(message, this);
				}			
			}else {
				System.out.println(this.name + " sends: " + message);
		        this.mediator.sendMessage(message, this);
			}		
		}

	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);
	}

}