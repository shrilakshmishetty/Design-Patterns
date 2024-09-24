package com.shri.Decorator;

public class SugarDecorator extends CoffeeDecorator {


	SugarDecorator(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
		
	}
	public int cost() {
		// TODO Auto-generated method stub
	
		return c.cost()+2;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return c.description()+ "with sugar";
		
	}

}
