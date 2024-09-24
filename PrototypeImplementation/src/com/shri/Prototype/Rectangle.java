package com.shri.Prototype;

public class Rectangle implements Shape{
	private int length;
	private int breadth;
	private int x;
	private int y;
	public Rectangle(int length,int breadth,int x,int y){
		this.length=length;
		this.breadth=breadth;
		this.x=x;
		this.y=y;
		
	}

	public Shape clone() {
		return new Rectangle(length,breadth,x,y);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", x=" + x + ", y=" + y + "]";
	}
	

}
