
public class ShirtShop {
	public static void main(String[] args) {
		System.out.println("Dostêpne rozmiary: ");
		for (Size s : Size.values()) {
			System.out.println(s.getDescription());
		}
		System.out.println("\n");

		Tshirt tshirt = new Tshirt();
		Size tshirtSize = sizeFromDescription("Ma³y");
		tshirt.setSize(tshirtSize);
		System.out.println("Rozmiar: "+tshirt.getSize().getDescription());
	}

	static Size sizeFromDescription(String desc) {
		for (Size s : Size.values()) {
			if (s.getDescription().equals(desc))
				return s;
		}
		return Size.MEDIUM;
	}
}
