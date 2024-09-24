package com.shri.Decorator;

public class SimpleCoffee implements Coffee{
	int n;
	@Override
	public  int cost() {
	 n=10;
		// TODO Auto-generated method stub
		
		return n;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Cost of Simple Coffee ";
		
	}

}
