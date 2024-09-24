package com.shri.Command;

public class Undoing implements Command{
	Document doc;
	
	Undoing(Document doc){
		this.doc=doc;
		
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		doc.undo();
		
	}

}
