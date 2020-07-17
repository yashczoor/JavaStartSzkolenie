package zadanie;

import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {
		Queue<Task> toDoList = new PriorityQueue<>();

		System.out.println("Dostępne opcje:");
		try (Scanner sc = new Scanner(System.in)) {
			Options usersChoice = null;

			while (usersChoice != Options.EXIT) {
				for (Options o : Options.values()) {
					System.out.println(o);
				}
				try {
					usersChoice = Options.createFromInt(sc.nextInt());
					sc.nextLine();

					switch (usersChoice) {
					case EXIT:
						break;
					case ADD:
						toDoList.offer(createTask(sc));
						break;
					case POLL:
						
						
						if(!toDoList.isEmpty()) {
						System.out.println(toDoList.poll());
						} else {
						System.out.println("Brak zadań");}
						break;
						
					default:
						break;
					}
				} catch (InputMismatchException e) {
					sc.next();
				}
			}
		}
	}

	private static Task createTask(Scanner sc) {
		Task toDo = new Task();
		System.out.println("Nazwa zadania: ");
		toDo.setName(sc.nextLine());
		System.out.println("Opis: ");
		toDo.setDescription(sc.nextLine());

		System.out.println("Priorytet do wyboru z:");
		for (Priority p : Priority.values()) {
			System.out.println(p);
		}

		toDo.setPriority(Priority.valueOf(sc.nextLine().toUpperCase()));
		return toDo;
	}
}

enum Options {
	ADD(1, "Dodaj zadanie"), POLL(2, "Kolejna misja"), EXIT(3, "Wyjście");

	private int optVal;
	private String desc;

	Options(int optVal, String desc) {
		this.optVal = optVal;
		this.desc = desc;
	}

	public int getOptVal() {
		return this.optVal;
	}

	@Override
	public String toString() {
		return this.optVal + " - " + this.desc;
	}

	public static Options createFromInt(int optVal) {
		Options result = null;
		try {
			result = Options.values()[optVal - 1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Brak takiej opcji");
		}

		return result;
	}

}
