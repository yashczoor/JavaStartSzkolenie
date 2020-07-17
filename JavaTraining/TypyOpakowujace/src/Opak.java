public class Opak {
	public static void main(String[] args) {
		int num = 5;
		
		Integer numer1 = new Integer(num);
		System.out.println(numer1);
		Integer numer2 = Integer.valueOf(num);
		System.out.println(numer2);
		String number = Integer.toString(num);
		System.out.println(number);
		String numerTekstowo = "5.5";
		double numerLiczbowo = Double.parseDouble(numerTekstowo);
		System.out.println(numerLiczbowo);
		numerTekstowo = "5";
		Integer calkowitaLiczbowo = Integer.parseInt(numerTekstowo);
		System.out.println(calkowitaLiczbowo);
	}
}
