package com.shri.ChainOfResponsibility;
import java.util.*;

public class LoggingMiddleware extends Middleware{
	

	@Override
	public boolean check(String username, String password, String role) {
		
		System.out.println("Logging by ->"+logging(username));
		
		return checkNext(username,password,role);
	}
	public String logging(String username) {
		return username;
		
		
		
		
	}

}
