package day3_Parameterized_constructor;

public class Employee3 {
	
	int id;
	String name;
	
	public Employee3(int id , String name) {
		System.out.println(this.id);
		System.out.println(this.name);
		
		this.id = id;
		this.name = name;
		
		System.out.println(this.id);
		System.out.println(this.name);
	}
	
	public void something() {
		System.out.println(this.id);
		System.out.println(this.name);
	}
	

}
