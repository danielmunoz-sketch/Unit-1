package unit1;

import java.util.Scanner;
public class Exercise08 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//Declare the variables
		int edad;
		String nombre;
		
		//Ask the name 
		System.out.println("Introduzca su nombre:");
		nombre= reader.nextLine();
		
		//Ask the age 
		System.out.println("Introduzca su edad:");
		edad= reader.nextInt();
		
		//Show a answer with the name and age
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		//Close the Scanner
		reader.close();
	}

}
