/*Develop a home automation system. In this system, you have various subsystems such as lighting, heating, and security. Each subsystem has its own complex operations. You want to provide a simplified interface to the client to control the entire home automation system without needing to know the details of each subsystem using facade design pattern.
1. Create Subsystems: Define the subsystems (e.g., Lighting, Heating, Security) with their operations.
2. Create a Facade: Implement a HomeAutomationFacade class that provides a simple interface to control the subsystems.
3. Use the Facade: Demonstrate how to use the HomeAutomationFacade to control the home automation system.
*/
package com.shri.Facade;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HomeAutomationFacade home=new HomeAutomationFacade();
		System.out.println("Enter/Leave the home");
		String s1=sc.nextLine();
		if(s1.equalsIgnoreCase("enter")){
			home.enterHome();
		}
		else if(s1.equalsIgnoreCase("leave")) {
			home.leaveHome();
			}
		else {
			System.out.println("Invalid Command");
		}
		
	}

}
