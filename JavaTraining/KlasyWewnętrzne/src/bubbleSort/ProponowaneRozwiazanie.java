package bubbleSort;

public class ProponowaneRozwiazanie {
	public static void main(String[] args) {
		Sortable sorter = new Sortable() {
			
			@Override
			public int[] sort(int[] tab) {
				int temp;
				for(int i = 0; i<tab.length;i++) {
					System.out.println("*");
					for (int j = 1; j<tab.length - i;j++) {
						System.out.println(tab[j-1] + ">" + tab[j] + " " + (tab[j-1]>tab[j]));
						if(tab[j-1]>tab[j]) {
							temp = tab[j];
							tab[j]=tab[j-1];
							tab[j-1]=temp;
						}
					}
				}
				return tab;
			}
		};
		int[] tab = {1,3,4,10,8, 29, 300, -2};
		sorter.sort(tab);
		for(int tmp: tab) {
			System.out.println(tmp);
		}
	}
}
