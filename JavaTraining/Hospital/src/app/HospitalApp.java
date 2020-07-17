package app;

import data.*;

public class HospitalApp {
	public static void main(String[] args) {
		Hospital hosp = new Hospital();
		
		hosp.addStaff(new Doctor("Aleksandra", "Jaroszuk", 12000, 1200));
		hosp.addStaff(new Nurse("Nina", "Kobacka", 300, 218));
		hosp.addStaff(new Nurse("Piotr", "Jaroszuk", 30123, 1));
		
		System.out.println("Za³oga: \n");
		System.out.println(hosp);
	}
}
