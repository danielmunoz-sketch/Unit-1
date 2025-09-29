package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declared a variable for the age of the user and another for it age the following year
		int edad1;
		int edad2;
		
		//
		System.out.println("Introduzca tu edad:");
		edad1 = reader.nextInt();
		
		//
		edad2 = edad1 + 1;
		
		//
		System.out.println("El año que viene tendrás: " + edad2);
		
		//Close the Scanner
		reader.close();

	}

}
