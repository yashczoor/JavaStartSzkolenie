package bubbleSort;

public class SortTest {
	public static void main(String[] args) {
		Sortable bbl = new Sortable() {

			@Override
			public int[] sort(int[] tab) {
				int temp = 0;
				boolean change = true;

				do {
					change = false;
					System.out.println(".");
					for (int i = 0; i < tab.length - 1; i++)
						if (tab[i] > tab[i + 1]) { 
							temp = tab[i];
							tab[i] = tab[i + 1];
							tab[i + 1] = temp;
							change = true;
						}
				} while (change == true);
				return tab;
			}
		};

	int[] tab = {1,3,4,10,8, 29, 300, -2};
	bbl.sort(tab);
	for(int tmp: tab) {
		System.out.println(tmp);
	}
	}
}
