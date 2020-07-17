package Lekcja;

public class Amphibia implements CarInterface, BoatInterface{
	public static void main(String[] args) {
		Amphibia a = new Amphibia();
		a.printName();
	}
	
	@Override
	public void printName() {
		System.out.print("Amphibia to troch� ");
		CarInterface.super.printName();
		System.out.print("a troch� ");
		BoatInterface.super.printName();
	}
}
