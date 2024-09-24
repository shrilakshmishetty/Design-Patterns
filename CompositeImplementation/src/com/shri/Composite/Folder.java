package com.shri.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component{
	String name;
	Folder(String name){
		this.name=name;
		
	}

	List<Component> root=new ArrayList<>();

	@Override
	public void display(String sym) {
		// TODO Auto-generated method stub
		System.out.println(sym+"Folder:"+this.name);
		for(Component comp:root) {
			comp.display(sym +" "+"->");
		}
		
	}
	
	public void add(Component comp) {
		root.add(comp);
		
		
	}
	public void remove(Component comp) {
		root.remove(comp);
	}

}
