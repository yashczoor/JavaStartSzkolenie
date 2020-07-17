package data;

public class Doctor extends Person {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public Doctor(String firstName, String lastName, int salary, double bonus) {
		super(firstName, lastName, salary);
		setBonus(bonus);
	}
	@Override
	public String toString() {
		return super.toString() + " Premia: " + bonus;
	}
	
}
