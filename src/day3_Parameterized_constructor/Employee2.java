package day3_Parameterized_constructor;

public class Employee2 {
	//global variable
	String name;
	
	// Paramterized constructor can be used
	// to assign value of local variable to global 
	// variable
	
	public Employee2(String name) {
		//name2 -> local variable = ORANGE
		this.name = name;
		//name = ORANGE
	}
	

	
	
	public void printName() {
		System.out.println(name);
	}

}
