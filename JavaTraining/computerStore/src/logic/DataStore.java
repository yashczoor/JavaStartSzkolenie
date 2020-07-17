package logic;

import data.Computer;

public class DataStore {
	//field
	private static final int MAX_ARRAY = 100;
	private Computer[] computers;
	private int countComputers;
	
	//setget
	public Computer[] getComputers() {
		Computer[] compsAtStore = new Computer[countComputers];
		for(int i = 0; i < countComputers; i ++) {
			compsAtStore[i] = computers[i];
		}
		return compsAtStore;
	}
	public void setComputers(Computer[] computers) {
		this.computers = computers;
	}
	public int getCountComputers() {
		return countComputers;
	}
	public void setCountComputers(int countComputers) {
		this.countComputers = countComputers;
	}
	
	//contruct
	public DataStore() {
		setComputers(new Computer[MAX_ARRAY]);
		//countComputers = 0;
	}
	
	//add
	public void add(Computer c) {
		if(countComputers < MAX_ARRAY) {
			computers[countComputers] = c;
			countComputers++;
		} else {
			System.out.println("Array full!");
		}
	}
	//checkav (Computer) - ile takich samych
	public int checkAvailability(Computer c) {
		int avail = 0;
		
		for(int i = 0; i < countComputers; i++) {
			if(c.equals(getComputers()[i])) {
				avail++;
			}
		}
		return avail;
	}

	
}
