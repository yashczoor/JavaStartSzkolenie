package Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Scanner inputBox = new Scanner(System.in);
		inputBox.useLocale(Locale.US);
		
		CalcLogic calc = new CalcLogic();
		
		System.out.println("Wprowadz pierwsz� liczb�: ");
		calc.setA(inputBox.nextDouble());
		inputBox.nextLine(); //�eby operation nie zjad�o entera;
		
		System.out.println("Wybierz dzia�anie matematyczne: ");
		System.out.println("+");
		System.out.println("-");
		System.out.println("*");
		System.out.println("/");
		calc.setOperation(inputBox.nextLine());
		
		System.out.println("Wprowadz drug� liczb�: ");
		calc.setB(inputBox.nextDouble());
		
		inputBox.close();
		
		System.out.println(calc.getA() + " " + calc.getOperation() + " " + calc.getB() + " = " + 
		calc.calculate(calc.getA(), calc.getB(), calc.getOperation()));
		
		}
	}

