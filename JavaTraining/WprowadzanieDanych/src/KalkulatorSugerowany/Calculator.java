package KalkulatorSugerowany;

public class Calculator {
	public static final String PLUS = "+";
	public static final String MINUS = "-";
	public static final String MULTIPLY = "*";
	public static final String DIVIDE = "/";

	public double calculate(double a, double b, String operator) {
		double result = 0;

		switch (operator) {
		case PLUS:
			result = a + b;
			break;
		case MINUS:
			result = a - b;
			break;
		case MULTIPLY:
			result = a * b;
			break;
		case DIVIDE:
			result = a / b;
			break;
		default:
			System.out.println("masz error");
		}
		return result;
	}
}
