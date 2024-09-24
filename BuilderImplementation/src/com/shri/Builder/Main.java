package com.shri.Builder;

public class Main {
	public static void main(String[] args) {
		Computer c=new Computer.Builder().setCpu("hello").build();
		System.out.println(c);
		
	}

}
