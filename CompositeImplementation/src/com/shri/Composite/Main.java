package com.shri.Composite;

public class Main {
	public static void main(String[] args) {
		Component file1=new File("helooo");
		Component file2=new File("byee");
		Component file3=new File("thank you");
		Component file4=new File("sorry");
		Folder fol=new Folder("greet");
		Folder fol1=new Folder("greetings");
		fol.add(file1);
		fol.add(file2);
		fol.add(fol1);
		fol1.add(file3);
		fol1.add(file4);
		fol.display("");
		fol.remove(fol1);
		
		fol.display("");
		
		
		
	}

}
