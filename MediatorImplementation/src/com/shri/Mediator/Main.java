/*
 * Imagine you are designing a simple chat room application. Users can send messages to the chat room, and the chat room will broadcast the messages to all other users. Using the Mediator pattern can help manage the communication between users and the chat room.
1. Mediator Interface: Defines the interface for communication between colleagues (participants).
2. Concrete Mediator: Implements the mediator interface and coordinates communication between colleagues.
3. Colleague Interface: Defines the interface for communication with the mediator.
4. Concrete Colleague: Implements the colleague interface and communicates with other colleagues through the mediator.
5. Main class: To demonstrate chatroom.
*/
package com.shri.Mediator;
 
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Mediator room=new ChatRoom();
	
		System.out.println("Create a chat room  for 3 people");
		
			
			User user1=new User("shrii1",room);
			User user2=new User("shrii2",room);
			User user3=new User("shrii3",room);
			
	
		user1.sendMsg("hello everyone");
		user3.sendMsg("good evening");
				
		

	}

}
