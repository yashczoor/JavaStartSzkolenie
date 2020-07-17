package lekcja;

@FunctionalInterface
public interface IncrementalPrinter<T> {
	public T doSomething(T t);
}
