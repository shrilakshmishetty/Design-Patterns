package com.shri.singleton;

public class Logger {
	private static Logger log;
	int cnt=1;
	private Logger() {
		System.out.println("Object"+" "+cnt+" "+ "created");//constructor is called whenever object is created and it also prints the count of objects created
				cnt++;
		
	}
	
	public static Logger getLogger() {
		if(log==null) {
			log=new Logger();
		}
		return log;
	}
	
	 public static void info() {
		 System.out.println("Information Message");
		
	}
	 public static void error() {
		 System.out.println("Error Message");
		
	}
	 public static void debug() {
		 System.out.println("Debug Message");
		
	}


}
