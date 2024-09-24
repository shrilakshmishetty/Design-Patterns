package com.shri.Decorator;

public abstract class CoffeeDecorator implements Coffee{
	protected Coffee c;
	
	CoffeeDecorator(Coffee c){
		this.c=c;
	}
	
	public int cost() {
		// TODO Auto-generated method stub
	
		return c.cost();
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return c.description();
		
	}
	
	

}
