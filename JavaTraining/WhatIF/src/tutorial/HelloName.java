package tutorial;

public class HelloName {
	public static void main(String[] args) {
		final String krzysiek = "Krzysztof";
		final String maciek = "Maciek";
		final String marek = "Marek";
		
		String name = "Marek";
		
		switch(name) {
		case krzysiek:
			System.out.println("Siema " + krzysiek);
			break;
		case maciek: case marek:
			System.out.println("Siema prezesie!");
			break;
		default:
			System.out.println("Czeœæ nieznajomy!");
		}
	}
}
