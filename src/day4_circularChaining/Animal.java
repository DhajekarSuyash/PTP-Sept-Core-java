package day4_circularChaining;

public class Animal {
	
	public Animal() {
		System.out.println("Construcotr");
		printName();
	}
	
	private void printName() {
	System.out.println("Name");
	printAge();

	}
	
	private void printAge() {
		System.out.println("Age");
		printName();
	}

}
