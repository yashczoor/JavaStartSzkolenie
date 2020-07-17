package example;

public class Main {
	public static void main(String args[]) {
		Printer printer = new Printer();
		//System.out.println(printer.text); //nie dziala bo zmienna text jest private.
		printer.printText();
	}
}
