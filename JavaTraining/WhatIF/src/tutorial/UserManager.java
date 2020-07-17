package tutorial;

public class UserManager {
	public static void main(String[] args) {
		User user = new User("Jan", "Kowalski");
		
		System.out.println("Wybierz opcj�:");
		System.out.println("0 - wyj�cie");
		System.out.println("1 - wy�wietl informacje o u�ytkowniku");
		System.out.println("2 - modyikuj dane u�ytkownika");
	
		int option = 1;
		
		if(option == 0) {
			System.out.println("Bye!");
		} else if(option == 1) {
			System.out.println("User: " + user.getFirstName() + " " + "Surname: " + user.getLastName());
		} else if(option == 2) {
			user.setFirstName("firstName");
			user.setLastName("lastName");
			System.out.println("Nowe dane to: " + user.getFirstName() + " " + user.getLastName());
		}
	}
}
