package zadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
	private List<Integer> numbers;

	public List<Integer> getNumbers() {
		return numbers;
	}

	public Lotto() {
		numbers = new ArrayList<>();
		generate();
	}

	private void generate() {
		for (int i = 1; i <= 6; i++) {
			numbers.add(i);
		}
	}

	public void randomize() {
		Collections.shuffle(numbers);
	}

	public int checkResult(List<Integer>userNumbers) {
		int correct = 0;
		List<Integer>lottoResult = new ArrayList<>();
		
		for(int i=0;i<=5;i++) {
			lottoResult.add(numbers.get(i));
		}
		
		for(Integer i: userNumbers) {
			if(lottoResult.contains(i)){
				correct++;
			};
		}
		return correct;
		
	}
}
