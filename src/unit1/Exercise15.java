package unit1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		//Create a new scanner
		Scanner reader = new Scanner(System.in);
		
		//Declare a constant and double's variables 
		final int IVA = 21;
		double precio;
		double precioIVA;
		
		//Ask the price without IVA 
		System.out.println("Introduzca el precio:");
		precio = reader.nextDouble();
		
		//Calculate the price with the IVA 
		precioIVA = precio + precio*IVA/100;
		
		//Show the price with IVA
		System.out.println("El precio con IVA es de: " + precioIVA + " €");
		
		//Close the scanner
		reader.close();
	}

}
