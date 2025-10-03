package unit1_part2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//
		int numNiñ;
		int numAd;
		double precioTotal;
		double descuento;
		double precioSinDes;
		
		//
		System.out.println("Introduce el número de niños: ");
		numNiñ = reader.nextInt();
				
		//
		System.out.println("Introduce el número de adultos: ");
		numAd = reader.nextInt();
				
		//
		precioSinDes = (numNiñ*15.5) + numAd*20;
		descuento = precioSinDes > 100 ? precioSinDes*0.05 : 0;
		precioTotal = precioSinDes - descuento;
				
		//
		System.out.println("El precio sería de: " + precioTotal + " €");
				
		//Close the Scanner
		reader.close();
	}

}
