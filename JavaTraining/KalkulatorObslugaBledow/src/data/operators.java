package data;

import exceptions.UnknownOperatorException;

public enum operators {
	PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/");

	private final String symbol;

	operators(String symbol) {
		this.symbol = symbol;
	}

	public double calculate(double a, double b) throws ArithmeticException {
		switch (this) {
		case PLUS:
			return a + b;
		case MINUS:
			return a - b;
		case TIMES:
			return a * b;
		case DIVIDE:
			if (b == 0) {
				throw new ArithmeticException("Nie dziel przez zero!");
			} else {
				return a / b;
			}
		default:
			throw new ArithmeticException();
		}
	}

	public static operators createFromChar(String input) throws UnknownOperatorException {
		switch (input) {
		case "+":
			return operators.valueOf("PLUS");
		case "-":
			return operators.valueOf("MINUS");
		case "*":
			return operators.valueOf("TIMES");
		case "/":
			return operators.valueOf("DIVIDE");
		default:
			throw new UnknownOperatorException("Nie ma takiego operatora");
		}
	}

	@Override
	public String toString() {
		return symbol;
	}

}
