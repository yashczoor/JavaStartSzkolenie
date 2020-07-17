
public enum Size {
	SMALL("Mały"), MEDIUM("Średni"), LARGE("Duży");
	
	private String description;
	
	Size(String desc){
		description = desc;
	}
	//nie tworzymy settera bo zmienna z zasady
	//maj� by� w Enum niezmienne
	public String getDescription() {
		return description;
	}
}
