package com.shri.Command;

public class TextEditor {
	Document doc=new Document();
	public void write(String text) {
		Command c=new Typing(doc,text);
		c.execute();
		
		
	}
	public void undo() {
		Command c=new Undoing(doc);
		c.execute();
		
		
	}
	public void redo() {
		Command c=new Redoing(doc);
		c.execute();
		
	}
	public void print() {
		
		System.out.println(doc.print());
	}

}
