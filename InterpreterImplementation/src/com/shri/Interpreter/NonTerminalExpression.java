package com.shri.Interpreter;



public abstract class NonTerminalExpression implements AbstractExpression{
	 protected AbstractExpression leftExpression;
	 protected AbstractExpression rightExpression;

   public NonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
       this.leftExpression = leftExpression;
       this.rightExpression = rightExpression;
   }
}