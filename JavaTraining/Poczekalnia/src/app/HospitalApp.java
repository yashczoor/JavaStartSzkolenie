package app;

import java.util.Scanner;

import data.Patient;
import logic.Hospital;

public class HospitalApp {
	public static final int EXIT = 0;
	public static final int ADD = 1;
	public static final int SHOW = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 100;

		Hospital hospital = new Hospital();

		while (option != EXIT) {
			System.out.println();
			System.out.println("0 - Wyjœcie");
			System.out.println("1 - dodaj pacjenta");
			System.out.println("2 - poka¿ kolejkê");

			option = sc.nextInt();

			switch (option) {
			case EXIT:
				System.out.println("papa");
				break;
			case ADD:
				if (hospital.getCurrLength() < hospital.getMax()) {
					Patient patient = new Patient();
					sc.nextLine();
					System.out.println("Podaj imiê:");
					patient.setFirstName(sc.nextLine());
					System.out.println("Podaj nazwisko:");
					patient.setLastName(sc.nextLine());
					System.out.println("Podaj pesel:");
					patient.setPesel(sc.nextLine());
					hospital.addPatient(patient);
					break;
				} else {
					System.out.println("kolejka pe³na");
					break;
				}
			case SHOW:
				hospital.printQue();
				break;
			default:
				System.out.println("Wybierz inn¹ opcjê");
			}
		}
		
		sc.close();
	}

}
