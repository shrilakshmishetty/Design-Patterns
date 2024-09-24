package com.shri.Decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee c=new SimpleCoffee();
		c=new MilkDecorator(c);
		System.out.println(c.description()+" , "+c.cost());
	    c=new SugarDecorator(c);
		System.out.println(c.description()+" , "+c.cost());
		c=new CaramelDecorator(c);
		System.out.println(c.description()+" "+c.cost());
		

	}

}
