package com.shri.Interpreter;



public class TerminalExpression implements AbstractExpression{
	int val;
	TerminalExpression(int val){
		this.val=val;
	}
	@Override
	public int interpret(Context cont) {
		// TODO Auto-generated method stub
		return val;
	}


}
