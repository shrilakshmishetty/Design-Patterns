/*Create a simple drawing application that supports adding shapes to a canvas. The application should also provide undo and redo functionality. Implement this functionality using the Memento design pattern.
1. Memento: This class will store the state of the Canvas.
2. Originator: The Canvas class will create and restore states from Mementos.
3. Caretaker: Manages the save and restore of Mementos.
4. Main: Demonstrate - Add shape Circle and Square, perform undo and redo. Then add shape Triangle then perform undo and redo.*/
package com.shri.Memento;

public class Main {
	public static void main(String[] args) {
        Canvas canvas = new Canvas();
        CareTaker caretaker = new CareTaker(canvas);

        caretaker.addShape("Circle");
        caretaker.addShape("Square");
        canvas.showShapes();
        
        caretaker.undo();
        canvas.showShapes();
        caretaker.redo();
        canvas.showShapes();
        caretaker.addShape("Triangle");
        caretaker.undo();
        caretaker.redo();

        canvas.showShapes();
    }

}
