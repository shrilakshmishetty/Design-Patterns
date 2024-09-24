package com.shri.Interpreter;



public class MultiplyExpression extends NonTerminalExpression{

	public MultiplyExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
		super(leftExpression, rightExpression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpret(Context context) {
        int leftResult = leftExpression.interpret(context);
        int rightResult = rightExpression.interpret(context);
        int result = leftResult * rightResult;
        System.out.println(leftResult + " * " + rightResult + " = " + result);
        return result;
	}

}
