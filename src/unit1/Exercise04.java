package unit1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//Declared a variable for the number that the user will introduce
		int firstmark;
		int secondmark;
		float result;
		//
		System.out.println("Introduzca una nota:");
		//
		firstmark = reader.nextInt();
		//
		System.out.println("Introduzca otra nota:");
		//
		secondmark = reader.nextInt();
		//
		result = (firstmark + secondmark) / 2;
		System.out.println("Su media es de: " + result);
		//
		reader.close();

	}

}
