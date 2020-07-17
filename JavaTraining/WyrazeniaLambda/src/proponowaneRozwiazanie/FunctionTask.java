package proponowaneRozwiazanie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionTask {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> randomNumbers = new ArrayList<>();
		// generujemy liste
		generate(randomNumbers, 10, () -> r.nextInt(1000));
		consume(randomNumbers, x -> System.out.println(x + " "));
		System.out.println();
		filterList(randomNumbers, x -> x % 2 == 0);
		consume(randomNumbers, x -> System.out.println(x));
	}

	private static <T> void generate(List<T> list, int toGenerate, Supplier<T> sup) {
		for (int i = 0; i < toGenerate; i++) {
			list.add(sup.get());
		}
	}

	private static <T> void consume(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}

	private static <T> void filterList(List<T> list, Predicate<T> pred) {
		Iterator<T> it = list.iterator();
		while (it.hasNext()) {
			T tmp = it.next();
			if (pred.test(tmp)) {
				it.remove();
			}
		}
	}
}
