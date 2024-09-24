package com.shri.Decorator;

public class MilkDecorator extends CoffeeDecorator{
	

	MilkDecorator(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	public int cost() {
		// TODO Auto-generated method stub
		
		return c.cost()+ 5;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return c.description() +"with milk";
		
		
	}

}
