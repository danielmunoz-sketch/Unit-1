package unit1_part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//Declared a variable for the number that the user will introduce
		int num1;
		int num2;
		int resto;
		int numSumar;
				
		//Ask the number
		System.out.println("Introduzca un número entero:");
		num1 = reader.nextInt();
		System.out.println("Introduzca otro número entero:");
		num2 = reader.nextInt();
		
		//
		resto= num1%num2;
		numSumar= (resto == 0) ? 0 : (num2-resto);
				
		//Write the message and the number
		System.out.println("El número a sumar para que sea multiplo de " + num2 + " es: " + numSumar);
				
		//Close the Scanner
		reader.close();
	}

}
