
public class BreakContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("Pierwsza pêtla: " + i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break; //ale unikamy break w pêtli for
			}
			System.out.println("Druga pêtla: " + i);
		}
	}
}
