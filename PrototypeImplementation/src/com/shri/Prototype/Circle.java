package com.shri.Prototype;

public class Circle implements Shape {
	private  int radius;
	private  int x;
	private  int y;
	public Circle(int radius,int x,int y){
		System.out.println("wait for the object to be createdddd");
		this.radius=radius;
		this.x=x;
		this.y=y;
	
		
	}
	public Shape clone() {
		
		return new Circle(radius,x,y);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}
	
	

}
