
public class PairTest {
	public static void main(String[] args) {
		PairContainer<Integer, String> pair1 = new PairContainer<>(123, "Ania");
		PairContainer<String, String> pair2 = new PairContainer<>("kisiel", "ciastka");
		PairContainer<Double, Double> pair3 = new PairContainer<Double, Double>(1.4, 12.3456);
	
		System.out.println(pair1);
		System.out.println(pair2);
		System.out.println(pair3);
		}
}
