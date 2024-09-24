package com.shri.Interpreter;



public class DivideExpression extends NonTerminalExpression {

	public DivideExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
		 super(leftExpression, rightExpression);
    }

    @Override
    public int interpret(Context cont) {
        int leftResult = leftExpression.interpret(cont);
        int rightResult = rightExpression.interpret(cont);
        if (rightResult == 0) {
            throw new ArithmeticException("Division by zero");
        }
        int result = leftResult / rightResult;
        System.out.println(leftResult + " / " + rightResult + " = " + result);
        return result;
    }
}
