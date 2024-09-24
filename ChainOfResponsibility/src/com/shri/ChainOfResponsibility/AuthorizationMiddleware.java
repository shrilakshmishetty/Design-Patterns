package com.shri.ChainOfResponsibility;
import java.util.*;

public class AuthorizationMiddleware extends Middleware{
	

	@Override
	public boolean check(String username, String password, String role) {
		// TODO Auto-generated method stub
		if(!authorize(role)) {
			System.out.println("Authorization failed");
			return false;
			
		}
		return checkNext(username,password,role);
	}
	public boolean authorize(String role) {
		if(role.equals("admin")) {
			return true;
			
		}
				
		
		return false;
		
		
	}

}
