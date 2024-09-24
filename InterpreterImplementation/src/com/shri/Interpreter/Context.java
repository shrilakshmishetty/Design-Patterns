package com.shri.Interpreter;



public class Context {private String expression;
private int index;

public Context(String expression) {
	this.expression = expression;
    this.index = 0;
}

public AbstractExpression parseExpression() {
    return parseAdditionAndSubtraction();
}

private AbstractExpression parseAdditionAndSubtraction() {
    AbstractExpression left = parseMultiplicationAndDivision();
    while (index < expression.length()) {
        char operator = expression.charAt(index);
        if (operator == '+' || operator == '-') {
            index++;
            AbstractExpression right = parseMultiplicationAndDivision();
            if (operator == '+') {
                left = new AddExpression(left, right);
            } else {
                left = new SubtractExpression(left, right);
            }
        } else {
            break;
        }
    }
    return left;
}

private AbstractExpression parseMultiplicationAndDivision() {
    AbstractExpression left = parsePrimary();
    while (index < expression.length()) {
        char operator = expression.charAt(index);
        if (operator == '*' || operator == '/') {
            index++;
            AbstractExpression right = parsePrimary();
            if (operator == '*') {
                left = new MultiplyExpression(left, right);
            } else {
                left = new DivideExpression(left, right);
            }
        } else {
            break;
        }
    }
    return left;
}

private AbstractExpression parsePrimary() {
    if (index < expression.length() && expression.charAt(index) == '(') {
        index++;
        AbstractExpression expr = parseAdditionAndSubtraction();
        if (index < expression.length() && expression.charAt(index) == ')') {
            index++;
        }
        return expr;
    } else {
        return parseNumber();
    }
}

private AbstractExpression parseNumber() {
    int start = index;
    while (index < expression.length() && Character.isDigit(expression.charAt(index))) {
        index++;
    }
    int number = Integer.parseInt(expression.substring(start, index));
    return new TerminalExpression(number);
}

}
