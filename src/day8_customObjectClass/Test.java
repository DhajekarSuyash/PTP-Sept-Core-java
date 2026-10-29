package day8_customObjectClass;

public class Test {

	public static void main(String[] args) {

		Student s = new Student();
		//set value
		s.setName("APPLE");
		//print - get value
		String name = s.getName();
		System.out.println(name);
		
		//
		s.setCity("BERLIN");
		 String city = s.getCity();
		 System.out.println(city);
	}

}
