package day7_conditional_statements;

import java.util.Scanner;

public class LadderifelseCond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter day of a week in upper case : ");
		
		
		String day = sc.next();
		
		if(day.equals("MONDAY")) {
			System.out.println("today is monday");
		}
		
		else if(day.equals("TUESDAY")) {
			System.out.println("today is tuesday");
		}
		else if(day.equals("WEDNESDAY")) {
			System.out.println("Today is wednesday");
		}
		else if(day.equals("THURSDAY")) {
			System.out.println("Today is THURSDAY");
		}
		else if(day.equals("FRIDAY")) {
			System.out.println("Today is FRIDAY");
		}
		else if(day.equals("SATURDAY")) {
			System.out.println("Today is SATURDAY");
		}
		else if(day.equals("SUNDAY")) {
			System.out.println("Today is SUNDAY");
		}
		else {
			System.out.println("PLease enter proper day of a week");
		}

	}

}
