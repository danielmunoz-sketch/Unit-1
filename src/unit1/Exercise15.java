package unit1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		//
		Scanner reader = new Scanner(System.in);
		
		//
		final int IVA = 21;
		double precio;
		double precioIVA;
		
		//
		System.out.println("Introduzca el precio:");
		precio = reader.nextDouble();
		
		//
		precioIVA = precio + precio*IVA/100;
		
		//
		System.out.println("El precio con IVA es de: " + precioIVA + " €");
		
		//
		reader.close();
	}

}
