package com.shri.Command;

public class Redoing implements Command{
	Document doc;
	
	Redoing(Document doc){
		this.doc=doc;
		
		
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		doc.redo();
		
	}

}
