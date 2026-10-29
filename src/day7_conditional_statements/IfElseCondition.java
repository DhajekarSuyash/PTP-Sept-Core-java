package day7_conditional_statements;

public class IfElseCondition {

	public static void main(String[] args) {
		// String
		// Problem statement - if any word starts with 'a' then print "this word starts with A"
		// else print "this word do not start with A"
		
		String s = "zapple";
		//boolean flag = s.startsWith("a");
		
		if(s.startsWith("a")){
			System.out.println("this word starts with A");
		}else {
			System.out.println("This word do not start with A");
		}
		
		// number - is number even

		int a = 1250;
		//boolean op = (a % 2 == 0);
		// if number is even print it is even number else print it is an odd number
		
		if(a % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
		
		
		
		
		
		// 15 / 2 == remin = 1 ->  odd number
		// 14 / 2 == remin = 0 -> even number
		

	}

}
