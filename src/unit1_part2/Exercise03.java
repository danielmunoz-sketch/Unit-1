package unit1_part2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//Declare the variables for the numbers that the user will introduce
		int num1;
		int num2;
		int resto;
		int numSumar;
				
		//Ask the number
		System.out.println("Introduzca un número entero:");
		num1 = reader.nextInt();
		System.out.println("Introduzca otro número entero:");
		num2 = reader.nextInt();
		
		//set the condition if the number is not a multiple of the second number give the value numSumar the number needed so that the entered number is a multiple of the second number
		resto= num1%num2;
		numSumar= (resto == 0) ? 0 : (num2-resto);
				
		//Write the message and the number
		System.out.println("El número a sumar para que sea multiplo de " + num2 + " es: " + numSumar);
				
		//Close the Scanner
		reader.close();
	}

}
