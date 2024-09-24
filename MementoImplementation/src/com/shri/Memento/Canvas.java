package com.shri.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Canvas {
	private List<String> shapes = new ArrayList<>();

    public void addShape(String shape) {
        shapes.add(shape);
        System.out.println("Added shape: " + shape);
    }

    public Memento save() {
        return new Memento(shapes);
    }

    public void restore(Memento memento) {
        shapes = new ArrayList<>(memento.getState());
        System.out.println("Canvas restored to state: " + shapes);
    }

    public void showShapes() {
        System.out.println("Current shapes: " + shapes);
    }
	
}
