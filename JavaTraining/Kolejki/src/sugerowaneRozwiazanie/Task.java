package sugerowaneRozwiazanie;

public class Task implements Comparable<Task>{
	private String name;
	private String description;
	private Priority priority;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Task(String name, String description, Priority priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}


	public Priority getPriority() {
		return priority;
	}


	public void setPriority(Priority priority) {
		this.priority = priority;
	}


	@Override
	public int compareTo(Task arg0) {
		return priority.compareTo(arg0.priority);
	}


	@Override
	public String toString() {
		return name + ", Opis:" + description;
	}
	
	
	
}
