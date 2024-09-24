
/*
 * Develop a simple text editor application. The text editor should support operations like typing text, undoing the last operation, and redoing the undone operation. Implement this functionality using the Command design pattern.
1. Command Interface: Define an interface that declares an execution method.
2. Concrete Commands: Implement commands for typing text, undoing, and redoing.
3. Invoker: The text editor will act as an invoker that will execute the commands.
4. Receiver: The document (text buffer) is the receiver of the commands.
*/
package com.shri.Command;
 

public class Main {
	public static void main(String[] args) {
		TextEditor text=new TextEditor();
		text.write("heii,");
		text.write("world");
		text.write("world");
		text.print();
		text.undo();
		text.print();
		text.undo();
		text.print();
		text.redo();
		text.print();
		text.redo();
		text.print();
	}

}
