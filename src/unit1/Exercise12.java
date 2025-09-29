package unit1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declare the variables for the fruits and the price of both
		double kgManzanas;
		double kgPeras;
		double precio;
		
		//Ask the kilograms of apples
		System.out.println("Introduzca los kilogramos de manzanas:");
		kgManzanas= reader.nextInt();
		
		//Ask the kilograms of pears
		System.out.println("Introduzca los kilogramos de peras:");
		kgPeras= reader.nextInt();
		
		//Calculate the of apples and pears
		precio = (kgManzanas*2.35) + (kgPeras*1.95);
		
		//Show the price of the fruits
		System.out.println("Esto son " + precio + " €");
		
		//Close the Scanner
		reader.close();


	}

}
