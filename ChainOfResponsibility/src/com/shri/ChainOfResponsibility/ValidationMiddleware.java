package com.shri.ChainOfResponsibility;
import java.util.*;

public class ValidationMiddleware extends Middleware{
	

	@Override
	public boolean check(String username, String password, String role) {
		// TODO Auto-generated method stub
		if(!validation(username,password)) {
			System.out.println("Validation failed");
			return false;
			
		}
		return checkNext(username,password,role);
	}
	public boolean validation(String username,String password) {
		if(username==null || username.trim().isEmpty()|| password==null || password.trim().isEmpty()) {
			return false;
		}
 		return true;
		
		
	}

}
