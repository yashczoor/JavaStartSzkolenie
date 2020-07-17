package zadanie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GenerateAndRemoveEven {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		Random r = new Random();
		
		generateList(list, 10, () -> r.nextInt(100));
		printList(list, n -> System.out.println(n));
		removeEven(list, b -> b%2 == 0);
		System.out.println();
		printList(list, n -> System.out.println(n));
	}
	
	public static <T> void generateList(List<T>list, int num, Supplier<T> func){
		for(int i = 0;i<num;i++) {
			list.add(func.get());
		}
	}
	
	public static <T> void printList(List<T>list, Consumer<T> func) {
		for(T n: list) {
			func.accept(n);
		}
	}
	
	public static <T> void removeEven(List<T>list, Predicate<T>func) {
		//trzeba od tyłu bo wywala nie te
		//albo iterator jak ponizej
		for(int i=list.size()-1;i>0;i--) {
			if(func.test(list.get(i))) {
				list.remove(list.get(i));
			}
		}
	}
	
	public static <T> void removeEven2(List<T>list, Predicate<T>func) {
		Iterator<T> it = list.iterator();
		while(it.hasNext()) {
			T tmp = it.next();
			if(func.test(tmp)) {
				it.remove();
			}
		}
	}
	
}
