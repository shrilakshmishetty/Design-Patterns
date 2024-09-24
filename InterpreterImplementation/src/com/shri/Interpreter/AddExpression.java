package com.shri.Interpreter;


public class AddExpression extends NonTerminalExpression{

	public AddExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
		super(leftExpression, rightExpression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpret(Context cont) {
		// TODO Auto-generated method stub
		int leftResult = leftExpression.interpret(cont);
        int rightResult = rightExpression.interpret(cont);
        int result = leftResult + rightResult;
        System.out.println(leftResult + " + " + rightResult + " = " + result);
        return result;
	}

}
