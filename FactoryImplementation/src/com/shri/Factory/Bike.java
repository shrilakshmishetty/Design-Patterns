package com.shri.Factory;

public class Bike implements Vehicle{
	public String getType() {
		// TODO Auto-generated method stub
		return "Bike";
	}

	@Override
	public int getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public void getCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Seating capacity of the Bike for passengers is 1");
		
	}

}
