package com.shri.Factory;

public class Truck implements Vehicle{
	public String getType() {
		// TODO Auto-generated method stub
		return "Truck";
	}

	@Override
	public int getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 6;
	}

	public void getCapacity() {
		// TODO Auto-generated method stub
		System.out.println("Seating capacity of the Truck for passengers : 2");
	}

}
