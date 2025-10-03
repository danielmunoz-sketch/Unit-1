package unit1_part2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//Declare a variable for the number that the user will introduce
		double num;
				
		//Ask the decimal number
		System.out.println("Introduzca un número decimal:");
		num = reader.nextDouble();
		
		//Round the number
		num = (int) (num + 0.5);
		
		//Write the message and the number
		System.out.println("El redondeo del número escrito es: " + (int)num );
	
		//Close the Scanner
		reader.close();
	}

}
