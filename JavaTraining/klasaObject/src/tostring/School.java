package tostring;

public class School {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("Zosia", "Samosia");
		students[1] = new Student("Patryk", "Kyrtap");
		students[2]	= new Student("Piotr", "Jaroszuk");
		
		for(Student tmp: students) {
			System.out.println(tmp.toString());
		}
		

	}	
}
	
	/*
		String opisStudenta = s1.toString();
		System.out.println(opisStudenta);
		//mog� te� sobie przypisa� toString do zmiennej
		*/