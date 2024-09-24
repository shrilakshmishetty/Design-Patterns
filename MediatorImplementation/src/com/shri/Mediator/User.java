package com.shri.Mediator;

public class User implements Colleague{
	Mediator room;
	String name;
	
	User(String name,Mediator room){
		this.name=name;
		this.room=room;
		room.addUser(this);
		
		
	}

	

	@Override
	public void recvMsg(User u,String message) {
		// TODO Auto-generated method stub
		System.out.println(this.name +" has received the message : "+message+" from "+u.name);
		
	}



	@Override
	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name +" has sent message : "+msg+" in the chatroom");
		room.sendMsg(this,msg);
		
		
	}

}
