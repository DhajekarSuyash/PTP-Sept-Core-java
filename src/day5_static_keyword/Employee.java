package day5_static_keyword;

public class Employee {
	// static - variable , methods , block

	public Employee() {

		System.out.println("Employee Const");
	}

	static {
		System.out.println("Static block");
	}

	// variable
	static int a = 45;

	public static void something() {
		System.out.println("Employee static method - 1");
	}
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-	
	// non -static

	int b = 90;

	public void something2() {
		System.out.println("Employee method -2");
	}

}
