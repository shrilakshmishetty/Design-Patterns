package com.shri.Factory;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Displays the standard details like Type, NumberOfWheels and Capacity about different vehicles");
		System.out.println("Enter the Vehicle");
		Scanner sc=new Scanner(System.in);
		String vehicle=sc.next();
		
		Vehicle v=VehicleFactory.getInstance(vehicle);
		System.out.println("The vehicle type : "+v.getType());
		System.out.println(" Number of Wheels: "+v.getNumberOfWheels());
		v.getCapacity();
		
		

	}

}
