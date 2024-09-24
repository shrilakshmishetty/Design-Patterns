package com.shri.Command;

public class Typing implements Command{
	Document doc;
	String text;
	Typing(Document doc,String text){
		this.doc=doc;
		this.text=text;
		
	}

	@Override
	public void execute() {
		doc.appendText(text);
		// TODO Auto-generated method stub
		
	}

}
