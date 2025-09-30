package unit1_part2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//Declared a variable for the number that the user will introduce
		int num;
		int resto;
		int numSumar;
				
		//Ask the number
		System.out.println("Introduzca un número entero:");
		num = reader.nextInt();
		
		resto= num%7;
		numSumar= (resto == 0) ? 0 : (7-resto);
				
		//Write the message and the number
		System.out.println("El número a sumar para que sea multiplo de 7 es: " + numSumar);
				
		//Close the Scanner
		reader.close();
	}

}
