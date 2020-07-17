
public class PairContainer <T, V>{
	private T t;
	private V v;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
	public PairContainer(T t, V v) {
		setT(t);
		setV(v);
	}
	
	@Override
	public String toString() {
		return t + " " + v;
	}
	
	
}
