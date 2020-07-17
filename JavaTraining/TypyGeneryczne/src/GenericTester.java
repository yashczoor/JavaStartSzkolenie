
public class GenericTester {
	public static void main(String[] args) {
		//definicja kontener dla liczb calkowitych
		ContainerGeneric<Integer>integers = new ContainerGeneric<Integer>();
		//nowa tablica integerow
		integers.setArray(new Integer[5]);
		//pierwszy element to 5
		integers.getArray()[0] = 5;
		
		//a teraz na Stringi
		ContainerGeneric<String>strings = new ContainerGeneric<String>();
		//i przypisujemy tablice typu String
		strings.setArray(new String[10]);
		//przypisujemy elementy 1 i 2
		strings.getArray()[0] = "ania";
		strings.getArray()[1] = "basia";
		
		//odczytujemy ju¿ ez rzutowania!
		Integer num = integers.get(0);
		String str = strings.get(1);
	
		System.out.println(num);
		System.out.println(str);
	}
}
