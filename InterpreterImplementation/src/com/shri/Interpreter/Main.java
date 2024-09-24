
/*Create an interpreter for a simple arithmetic expression language. The language should support addition (+), subtraction (-), multiplication (*), and division (/). The expressions can contain integer numbers and should respect operator precedence. The interpreter should be able to evaluate expressions and return the result.
1. AbstractExpression: Declares an abstract interpret method.
2. TerminalExpression: Implements the interpret method for terminal symbols in the grammar.
3. NonTerminalExpression: Implements the interpret method for non-terminal symbols(eg: +,-,* and /) in the grammar.
4. Context: Contains information that is global to the interpreter.
5. Main: Demonstrate Interpreter design pattern by solving arithmetic expressions.
*/
package com.shri.Interpreter;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String expression = "((3*5*2)-6)/(8+4)"; 
		Context cont=new Context(expression);
		AbstractExpression exp=cont.parseExpression();
		int res=exp.interpret(cont);
		System.out.print(res);

	
	}

}
