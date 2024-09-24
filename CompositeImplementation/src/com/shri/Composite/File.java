package com.shri.Composite;

public class File implements Component {
	String name;
	File(String name){
		this.name=name;
		
	}

	@Override
	public void display(String sym) {
		// TODO Auto-generated method stub
		System.out.println(sym+"File:"+this.name);
		
	}

}
