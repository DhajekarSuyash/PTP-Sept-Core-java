package day6_scanner_class;

import java.util.Scanner;

public class Scanner_Project {

	public static int rollNo;
	public static String fullName;
	public static String city;
	public static long phoneNumber;

	public static void main(String[] args) {

		//input methods
		getDetailsFromConsole();
		// call printDetails() method - output
		printDetails();

	}

	// input method
	public static void getDetailsFromConsole() {
		// 1. Scanner Object
		Scanner sc = new Scanner(System.in);

		// input
		System.out.println("Enter full name : ");
		fullName = sc.nextLine();

		System.out.println("Enter Roll Number : ");
		rollNo = sc.nextInt();

		System.out.println("Enter City : ");
		city = sc.next();

		System.out.println("Enter Phone number : ");
		phoneNumber = sc.nextLong();

	}

	public static void printDetails() {
		// output - print
		System.out.println("*** USER PROVIDED FOLLOWING DETAILS ****");

		System.out.println("Full Name : " + fullName);
		System.out.println("Roll number : " + rollNo);
		System.out.println("city : " + city);
		System.out.println(phoneNumber);

	}

}
