package com.shri.Factory;

public class Car implements Vehicle{
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Car";
	}

	@Override
	public int getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void getCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Seating capacity of the car for passengers is 4");
		
	}

}
