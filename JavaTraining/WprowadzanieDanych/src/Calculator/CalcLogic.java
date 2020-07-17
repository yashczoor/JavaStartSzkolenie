package Calculator;

public class CalcLogic {
	// fields
	private double a;
	private double b;
	private String operation;

	// get and set
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}	
	public String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	// construct
	public CalcLogic(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public CalcLogic() {
		this.a = 0;
		this.b = 0;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

	public double calculate(double a, double b, String operation) {
		double result = 0;
		
		switch (operation) {
		case "+":
			result = add(a, b);
			break;
		case "-":
			result = subtract(a, b);
			break;
		case "*":
			result = multiply(a, b);
			break;
		case "/":
			result = divide(a, b);
			break;
		default:
			System.out.println("Nie ma takiego operatora");
		}
		
		return result;
	}
}
