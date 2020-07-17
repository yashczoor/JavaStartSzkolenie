package lekcja;

public class CompareNumbers {
	public static void main(String[] args) {
		BiggestNumber nc = new BiggestNumber() {
			//klasa anonimowa, od razu miêdzy nawiasami klamrowymi
			
			@Override
			public int takeBiggest(int[] tab) {
				if(tab == null || tab.length == 0) {
					return 0;
				}
				
				int biggestNumber = tab[0];
				
				for (int i = 1;i<tab.length;i++) {
					if(biggestNumber < tab[i]) {
						biggestNumber = tab[i];
					}
				}
				return biggestNumber;
				}
		}; //<-- œrednik po klamrze?
		
		int[] tab = {500000,10,15,23,-8,123123,1};
		System.out.println("Max to: " + nc.takeBiggest(tab));
	}
}
