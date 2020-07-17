package logic;

import data.Patient;

public class Hospital {
	private final int MAX = 10;
	Patient[] que;
	private int currLength;
	
	public int getCurrLength() {
		return currLength;
	}

	public void setCurrLength(int currLength) {
		this.currLength = currLength;
	}

	public Hospital() {
		que = new Patient[getMax()];
		setCurrLength(0);
	}

	public void addPatient(Patient patient) {
		que[getCurrLength()] = patient;
		setCurrLength(getCurrLength() + 1);
	}

	public void printQue() {
		for(int i = 0; i < getCurrLength(); i++) {
			System.out.println(que[i].getFirstName() + " " + que[i].getLastName() + " " + que[i].getPesel());
		}
	}

	public int getMax() {
		return MAX;
	}



}
