package second;

import first.Parent;

public class Child extends Parent{
	
	public Child() {
		name = "Hello"; //ok, bo by�o protected
		value = 5; // value nie jest dziedziczone, bo jest default
	}
}
