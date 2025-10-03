package unit1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//Declare the variables 
		int edad;
		boolean adulto;
		
		//Ask the age 
		System.out.println("Introduzca su edad:");
		edad= reader.nextInt();
		
		//Set that if the age is equal or higher than 18 the variable adult is true
		adulto= edad>=18;
		
		//Show if adult it's true or not 
		System.out.println("¿Eres mayor de edad? " + adulto);
		
		//Close the Scanner
		reader.close();

	}

}
