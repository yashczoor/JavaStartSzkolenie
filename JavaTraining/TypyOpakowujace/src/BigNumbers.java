import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
	BigInteger big1 = new BigInteger("10987654321");
	BigDecimal big2 = BigDecimal.valueOf(0.7);
	
	public static void main(String[] args) {
		double a = 0.7;
		double b = 0.3;
		System.out.println(a - b);
		
		BigDecimal aBig = BigDecimal.valueOf(a);
		BigDecimal bBig = BigDecimal.valueOf(b);
		//trzeba u¿ywaæ metod do obliczeñ
		//add, subtract, multiply, divide
		System.out.println(aBig.subtract(bBig));
	
	}
}
