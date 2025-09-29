package unit1;

import java.util.Scanner;
public class Exercise08 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//
		int edad;
		String nombre;
		//
		System.out.println("Introduzca su nombre:");
		nombre= reader.nextLine();
		//
		System.out.println("Introduzca su edad:");
		edad= reader.nextInt();
		//
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		//Close the Scanner
		reader.close();
	}

}
