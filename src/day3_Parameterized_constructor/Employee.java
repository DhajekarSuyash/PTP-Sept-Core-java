package day3_Parameterized_constructor;

public class Employee {
	// apple is a global variable
	int apple= 12;
	
	public Employee(String word) {
		// banana is a local variable
		int banana = 13;
		System.out.println("Employee constructor");
		System.out.println(word);
		System.out.println(apple);
	}

	
	public void printName(String name) {
		//orange is a local variable
		int orange = 45;
		System.out.println(apple);
	}

}
