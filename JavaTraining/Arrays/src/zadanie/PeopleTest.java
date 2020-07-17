package zadanie;


public class PeopleTest {
	public static void main(String[] args) {

		PersonDatabase pd = new PersonDatabase();

		pd.add(new Person("Piotr", "Jaroszuk", "91042315634"));
		pd.add(new Person("Nina", "Kobacka", "95031712345"));
		pd.add(new Person("Barek", "Jaroszuk", "12345678901"));
		pd.add(new Person("Kisiel", "Ciastka", "09876543210"));
		pd.add(new Person("a","b","c"));
		pd.add(new Person("d","e","f"));

		printDetails(pd);
		
		pd.remove(new Person("a", "b", "c"));
		pd.remove(new Person("Piotr", "Jaroszuk","91042315634"));
		printDetails(pd);
	}
	
	public static void printDetails(PersonDatabase pd) {
		System.out.println(pd.size());
		System.out.println(pd.toString());

	}
}
