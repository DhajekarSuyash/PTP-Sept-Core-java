package day6_scanner_class;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// class Name - Scanner
		Scanner sc = new Scanner(System.in);
//		// one of the datatypes - Integer
//		System.out.println("Enter your age : ");
//		int age = sc.nextInt();
//		System.out.println("age from scanner : " + age);
//		System.out.println("========================");
//
//		// percentage
//
//		System.out.println("Enter your percentage : ");
//		double percent = sc.nextDouble();
//		System.out.println("percentage from scanner : " + percent);
//		System.out.println("=======================");
		
		// String single word input -> non-primitive
//		System.out.println("Enter String");
//		String abc = sc.next();
//		System.out.println("String from scanner : " + abc);

		//String statement input
		System.out.println("String statement : ");
		String st =  sc.nextLine();
		System.out.println("statement from scanner : " + st);
		
		
	}

}
