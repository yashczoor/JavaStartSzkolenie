
public class ContainerGeneric <T>{
	private T[] array;
	
	public T[] getArray() {
		return array;
	}
	
	public void setArray(T[] array) {
		this.array = array;
	}
	
	public T get(int index) {
		return array[index];
	}
	
	public void printObjects() {
		for (T o: array) {
			System.out.println(o);
		}
	}
}
