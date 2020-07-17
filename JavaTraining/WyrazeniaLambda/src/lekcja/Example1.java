package lekcja;

import java.util.function.Function;

public class Example1 {
	public static void main(String[] args) {
		String original = "  WIELKI NAPIS   ";
		//original.toLowerCase().trim();
		//original = getLowerCaseTrim(original);
		Function<String, String>func = (String str) -> str.toLowerCase().trim();
		
		String lowerCaseTrimmed = func.apply(original);
		System.out.println(lowerCaseTrimmed);
	}
	
	public static String getLowerCaseTrim(String original) {
		return original.toLowerCase().trim();
	}
	
	
}
