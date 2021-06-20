package zadacha2;

public interface MessageMediator {
	
	void addUser(User user);

	void sendMessage(String message, User user);
	
}
