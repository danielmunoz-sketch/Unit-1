package unit1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//Declared a variable for the number that the user will introduce
		int num;
		//
		System.out.println("Introduzca un número:");
		//
		num = reader.nextInt();
		//
		System.out.println("El número escrito es: " + num);
		//
		reader.close();
	}

}
