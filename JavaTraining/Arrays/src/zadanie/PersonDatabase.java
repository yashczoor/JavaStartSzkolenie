package zadanie;

import java.util.Arrays;

public class PersonDatabase {
	private static final int INITIAL_SIZE = 1;
	
	private Person[] people;
	private int currPos;

	public Person[] getPeople() {
		return people;
	}

	public void setPeople(Person[] people) {
		this.people = people;
	}

	public int getCurrPos() {
		return currPos;
	}

	public void setCurrPos(int currPos) {
		this.currPos = currPos;
	}

	public PersonDatabase() {
		people = new Person[INITIAL_SIZE];
		this.setCurrPos(0);
	}

	public void add(Person p) {
		if (this.getPeople().length == this.getCurrPos()) {
			this.setPeople(Arrays.copyOf(this.getPeople(), this.getPeople().length * 2));
		}

		this.getPeople()[getCurrPos()] = p;
		currPos++;
	}

	public void remove(Person p) {
		boolean found = false;
		int i = 0;
		try {
		while (!found || i < people.length) {
			if(p.equals(people[i])) {
				found = true;
				System.arraycopy(people, i + 1, people, i, people.length - (i+1));
				currPos--;
			} else {
				i++;
			}
		}
		
	} catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
}
	public Person get(int index) throws ArrayIndexOutOfBoundsException {
		if (index >= getCurrPos() || index < 0) {
			throw new ArrayIndexOutOfBoundsException("Nie ma");
		}
		return getPeople()[index];
	}

	public int size() {
		int count = 0;
		for (Person p : people) {
			if (p != null) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		StringBuilder strPeople = new StringBuilder();

		for (Person p : people) {
			if(p != null)
			strPeople.append(p.toString());
			strPeople.append("\n");
		}
		return strPeople.toString();
	}
}
