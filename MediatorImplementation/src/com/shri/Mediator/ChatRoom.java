package com.shri.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
	List<User> list;
	ChatRoom(){
		list=new ArrayList<>();
	}

	@Override
	public void sendMsg(User u,String message) {
		// TODO Auto-generated method stud
		
		for(User l:list) {
			if(!(u.name).equals(l.name)) {
				l.recvMsg(u,message);
				
			}
			
		}
		
	}
	public void addUser(User u) {
		list.add(u);
	}

}
