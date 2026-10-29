package day4_contAndMethodChaining;

public class Employee {
	
	public Employee() {
		System.out.println("Employee Details");
		// call printName()
		printName();
		
	}
	
	public void printName() {
		System.out.println("Sarthak");
		// method in same class so no nooed to create obj
		printLastName();
	}
	
	public void printLastName() {
		System.out.println("KHARATE");
		
		//
		Qualification q = new Qualification();
		q.certification();
	}

}
