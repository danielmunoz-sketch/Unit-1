package unit1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//
		int edad;
		boolean adulto;
		//
		System.out.println("Introduzca su edad:");
		edad= reader.nextInt();
		//
		adulto= edad>=18;
		//
		System.out.println("¿Eres mayor de edad? " + adulto);
		//Close the Scanner
		reader.close();

	}

}
