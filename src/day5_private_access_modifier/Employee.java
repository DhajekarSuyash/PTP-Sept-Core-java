package day5_private_access_modifier;

public class Employee {
	
	// private -  access modifier
	// public , private , protected and default
	
	// private can not be used for class
	
	//constructor - object can not be created
	public Employee() {
		System.out.println("Employee Contructor");
	}
	
	//variable - not visible from another class
	private int a = 12;
	
	
	//method -  not visible from another class
	private void printEmployee() {
		System.out.println("Employee class method");
	}
	
	public void something() {
		printEmployee();
		System.out.println(a);
		
		
	}

}
