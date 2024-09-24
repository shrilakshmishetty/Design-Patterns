package com.shri.Prototype;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Do u want to create a Circle/Rectangle");
		String str=sc.nextLine();
		Circle s=null;
		Rectangle r=null;
		if(str.equalsIgnoreCase("Circle")) {
			s=new Circle(20,1,2);
			System.out.println(s);
		
		}
		else if(str.equalsIgnoreCase("Rectangle") ){
			r=new Rectangle(2,2,1,2);
			System.out.println(r);
			
			
		}
		else {
			System.exit(0);
		}
			
		
		
		
	System.out.println("Do u want to create a clone of Yes/No");
	String str1=sc.nextLine();
	if(str1.equalsIgnoreCase("Yes") && str.equalsIgnoreCase("Circle")) {
		Circle c1=(Circle)s.clone();
		System.out.println(c1);
	}else if(str1.equalsIgnoreCase("Yes") && str.equalsIgnoreCase("Rectangle")) {
		Rectangle r1=(Rectangle)r.clone();	
		System.out.println(r1);
	}
	else {
		System.exit(0);
	}
		
		
		
		
		
		
		
		
		

	}

}
