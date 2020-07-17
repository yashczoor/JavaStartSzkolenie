package zadanie;

public class Task implements Comparable<Task> {
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

	public Priority getPriority() {
		return priority;
	}

	public boolean setPriority(Priority priority) {
		try{
			this.priority = priority;
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
		
	public Task(String name, String description, Priority priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public Task() {
	}

	@Override
	public String toString() {
		return "Task " + name + " " + description;
	}

	
	@Override
	public int compareTo(Task t) {
		return priority.compareTo(t.priority);

	}
}

enum Priority {
	HIGH, MODERATE, LOW;
}