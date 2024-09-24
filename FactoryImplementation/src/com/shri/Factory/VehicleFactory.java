package com.shri.Factory;

public class VehicleFactory {
	public static Vehicle getInstance(String vehicle) {
		
		if(vehicle.equalsIgnoreCase("Car")) {
			return new Car();
		}
		else if(vehicle.equalsIgnoreCase("Bike")) {
			return new Bike();
		}
		else if(vehicle.equalsIgnoreCase("Truck")) {
			return new Truck();
		}
		return null;
	}

}
