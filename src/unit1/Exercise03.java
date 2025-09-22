package unit1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//Declared a variable for the number that the user will introduce
		int actyear;
		int bornyear;
		int age;
		//
		System.out.println("Introduzca el año actual:");
		//
		actyear = reader.nextInt();
		//
		System.out.println("Introduzca el año de nacimiento:");
		//
		bornyear = reader.nextInt();
		//
		age = actyear - bornyear;
		System.out.println("Tienes " + age + " años");
		//
		reader.close();

	}
}
