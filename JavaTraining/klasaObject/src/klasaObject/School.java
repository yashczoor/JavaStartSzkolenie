package klasaObject;

public class School {
	public static void main(String[] args) {
		Student s1 = new Student("Jan", "Kowalski");
		Student s2 = new Student("Jan", "Kowalski");
		System.out.println("Czy s1 == s2");
		System.out.println(s1 == s2);
		System.out.println("Czy s1.equals(s2)");
		System.out.println(s1.equals(s2));
		//2 razy false, bo obiekty odnosz� si� do innego miejsca w pami�ci
		// teraz dzia�a, bo dopisali�my w�asny test r�wno�ci w klasie Student
	}
}
