package com.shri.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
	private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();
    private Canvas canvas;

    public CareTaker(Canvas canvas) {
        this.canvas = canvas;
    }

    public void addShape(String shape) {
        undoStack.push(canvas.save());
        redoStack.clear();
        canvas.addShape(shape);
    }
    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(canvas.save());
            canvas.restore(undoStack.pop());
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(canvas.save());
            canvas.restore(redoStack.pop());
        } else {
            System.out.println("Nothing to redo.");
        }
    }


}
