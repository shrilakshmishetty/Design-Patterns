package com.shri.ChainOfResponsibility;

abstract class Middleware {
	private Middleware next;
	
	public Middleware linkWith(Middleware next) {
		this.next=next;
		return next;
	}
	
	public abstract boolean check(String username,String password,String role);
	
	public boolean checkNext(String username,String password,String role) {
		if(next==null) {
			return true;
		}
		return next.check(username, password, role);
		
	}

}
