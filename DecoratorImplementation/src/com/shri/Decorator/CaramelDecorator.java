package com.shri.Decorator;

public class CaramelDecorator extends CoffeeDecorator{
	

	CaramelDecorator(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	public int cost() {
		// TODO Auto-generated method stub
		
		return c.cost()+20;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return c.description()+"with caramel";
		
	}

}
