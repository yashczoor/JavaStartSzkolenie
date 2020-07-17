package klasaObject;

public class School2 {
	public static void main(String[] args) {
		Student s1 = new Student("Jan", "Kowalski");
		Student s2 = s1;
		System.out.println("Czy s1 == s2");
		System.out.println(s1 == s2);
		System.out.println("Czy s1.equals(s2)");
		System.out.println(s1.equals(s2));
		//Domyœlne zachowanie metody equals jest identyczne do operatora ==.
	}
}
