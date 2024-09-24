package com.shri.singleton;

public class LoggerImplementation {

	public static void main(String[] args) {
	
		
		Logger log1=Logger.getLogger();
		System.out.println("log1 instance hashcode"+" "+log1.hashCode());
		log1.info();
		log1.error();
		log1.debug();
		Logger log2=Logger.getLogger();
		System.out.println("log2 instance hashcode"+" "+log2.hashCode());
		
		
		
	

	}

}
