package com.shri.ChainOfResponsibility;
import java.util.*;

public class AuthenticationMiddleware extends Middleware{
	Map<String,String> mp=new HashMap<>();

	@Override
	public boolean check(String username, String password, String role) {
		// TODO Auto-generated method stub
		if(!authenticate(username,password)) {
			System.out.println("Authentication failed");
			return false;
			
		}
		return checkNext(username,password,role);
	}
	public boolean authenticate(String username,String password) {
		if(mp.containsKey(username) && mp.get(username).equals(password)) {
			return true;
			
		}
		else if(!mp.containsKey(username)) {
			mp.put(username, password);
			return true;
			
		}
		return false;
		
		
	}

}
