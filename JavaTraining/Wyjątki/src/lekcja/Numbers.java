package lekcja;

public class Numbers {
	private int[] numbers;
	
	public Numbers() {
		numbers = new int[10];
	}
	
	public void add(int index, int number) throws ArrayIndexOutOfBoundsException {
		if(index < 0) {
			throw new ArrayIndexOutOfBoundsException("index musi byæ > 0");
		} else if (index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException("Indeks musi byæ mniejszy od rozmiaru tablicy");
		}
		numbers[index] = number;
	}
	
	public int get(int index) throws ArrayIndexOutOfBoundsException{
		if(index < 0 || index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return numbers[index];
	}
}
