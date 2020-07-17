package klasaString;

public class StringMethods {
	public static void main(String[] args) {
		String words = " Jeden dwa trzy cztery piêæ szeœæ siedem";
		String sub1 = words.substring(1,6);
		String sub2 = words.replaceAll("dwa", "hehe");
		String sub3 = words.trim();
		char charat = words.charAt(2);
		int len = words.length();
		String upper = words.toUpperCase();
		String lower = words.toLowerCase();
		String[] splitted = words.split(" ");
		char lastChar = words.charAt(words.length()-1);
		
		System.out.println(lastChar);
		System.out.println(words);
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		System.out.println(charat);
		System.out.println(len);
		System.out.println(upper);
		System.out.println(lower);
		for(String tmp: splitted) {
		System.out.println(tmp);
		}
		
	}
	
}
