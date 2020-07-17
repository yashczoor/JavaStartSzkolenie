public class Company {
	public static void main(String[] args) {
		
		int employeeIndex = 4;
		Employee[] employees = new Employee[20];
		
		employees[0] = new Employee("Jan","Kowalski",2300);
		employees[1] = new Employee("Tomasz","Gryzio",10000);
		employees[2] = new Employee("Mateusz","Boryga",5600);
		employees[3] = new Employee("Piotr","Siekierski",3000);
		employees[4] = new Employee("Marcin","Paluszkiewicz",4200);
		
		
		System.out.println("Wielkoœæ tablicy to: " + employees.length);
		System.out.println("Ale jej ostatni element to:" + (employees.length - 1) );
		System.out.println("Bo tablica zaczyna siê od pozycji 0.");
		
		
		System.out.println(employees[employeeIndex - 1].getFirstName()+ " " +
							employees[employeeIndex - 1].getLastName()+ " " +
							employees[employeeIndex - 1].getSalary());
	}
}
