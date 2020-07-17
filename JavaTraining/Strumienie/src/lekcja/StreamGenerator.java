package lekcja;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGenerator {
	public static void main(String[] args) {
		
		//strumień może być przetworzony raz
		Stream<Integer>numStream = Stream.iterate(0, x->x+1);
		//100 liczb podzielnych przez 2
		//List<Integer>numbers = numStream.filter(x->x%2==0).limit(100).collect(Collectors.toList());
		//kwadraty 100 kolejnych liczb całkowitych
		List<Integer>sqNumbers = numStream.map(x->x*x).limit(100).collect(Collectors.toList());
		//List<Integer>negativeNumbers = numStream.map(x -> -x).limit(100).collect(Collectors.toList());
		
		
		/*for(Integer i: negativeNumbers) {
			System.out.println(i);
		}*/
		//numbers.forEach(System.out::println);
		sqNumbers.forEach(System.out::println);
	
	}
}
