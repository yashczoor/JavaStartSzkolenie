public class Zadanie {
/* Napisz program sk³adaj¹cy siê z jednej klasy o dowolnej nazwie. 
 * W metodzie main zadeklaruj tablicê dwuwymiarow¹ liczb typu double. 
 * Wype³nij j¹ liczbami zgodnie z poni¿szym rysunkiem.
 */
	public static void main(String[] args) {
	
	double[][] arr = new double[3][];
	double[] firstRow = {1.0,1.5,2.0};
	double[] secondRow = {1.5,2.0,2.5};
	double[] thirdRow = {2.0,2.5,3.0};
	double result;
	
	arr[0] = firstRow;
	arr[1] = secondRow;
	arr[2] = thirdRow;
	
	//System.out.println(twoDimensionsArr[2][2]);
	result = (arr[0][0]*arr[1][1]*arr[2][2])
			+
			(arr[0][2]*
					arr[1][1]*
					arr[2][0]);
	System.out.println(result);
	
	result = (arr[0][1]+arr[1][1]+arr[2][1])*(arr[1][0]+arr[1][1]+arr[1][2]);
	System.out.println(result);
	
	result = arr[0][0]+arr[0][1]+arr[0][2]+arr[1][2]+arr[2][2]+arr[2][1]+arr[2][0]+arr[1][0];
	System.out.println(result);
	
	
		
	}
}
