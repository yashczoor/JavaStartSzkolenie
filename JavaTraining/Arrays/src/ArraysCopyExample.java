
public class ArraysCopyExample {
	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,5,6,7,8,9};
		
		int[] num2 = new int[num1.length];
		
		System.arraycopy(num1, 4, num2, 0, num1.length-4);
	
		for(int num: num2) {
			System.out.println(num + " ");
		}
	}
}
