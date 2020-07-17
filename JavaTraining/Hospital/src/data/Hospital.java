package data;

public class Hospital {
	private final static int MAX_CREW = 3;
	private int crewNumber;
	private Person[] staff;
	
	public int getCrew() {
		return crewNumber;
	}

	public void setCrew(int crewNumber) {
		this.crewNumber = crewNumber;
	}
	public Person[] getStaff() {
		return staff;
	}

	public void setStaff(Person[] staff) {
		this.staff = staff;
	}

	public Hospital() {
		setStaff(new Person[MAX_CREW]);
		setCrew(0);
	}
	
	public void addStaff(Person p) {
		if(getCrew() <= MAX_CREW) {
			getStaff()[getCrew()] = p;
			setCrew(crewNumber + 1);
		} else {
			System.out.println("Staff full");
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i<getCrew();i++) {
			result = result + staff[i] + "\n";
		}
		return result;
	}

	
}
