package zadacha2;

public class Main {

	public static void main(String[] args) {
		
        MessageMediator chat = new Chat();
		
        User user1 = new ChatUser(chat, "Ivan");
		User user2 = new ChatUser(chat, "Maria");
		User user3 = new ChatUser(chat, "Peter");
		
		user2.send("addBot");
		user1.send("cat");
		user3.send("hi");

	}

}
