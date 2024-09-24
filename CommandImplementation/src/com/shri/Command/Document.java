package com.shri.Command;

import java.util.Stack;

//Document.java
public class Document {
 private StringBuilder text = new StringBuilder();
 private Stack<String> undoStack = new Stack<>();
 private Stack<String> redoStack = new Stack<>();

 public void appendText(String newText) {
     undoStack.push(text.toString());
     text.append(newText);
     redoStack.clear(); 
 }

 public void undo() {
     if (!undoStack.isEmpty()) {
         redoStack.push(text.toString());
         text = new StringBuilder(undoStack.pop());
     }
 }

 public void redo() {
     if (!redoStack.isEmpty()) {
         undoStack.push(text.toString());
         text = new StringBuilder(redoStack.pop());
     }
 }
 public  String print() {
	 return text.toString();
 }


}

