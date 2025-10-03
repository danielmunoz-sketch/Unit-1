package unit1_part2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//Declare the variables
		double mili;
		int cent;
		int metro;
		double resCent;
			
		//Ask the milimeters centimeters and meters
		System.out.println("Introduce una longitud en milímetros");
		mili = reader.nextDouble();
		System.out.println("Introduce una longitud en centímetros");
		cent = reader.nextInt();
		System.out.println("Introduce una longitud en metros");
		metro = reader.nextInt();
				
		//Calculate the total length in centimeters
		resCent = (mili/10) + cent + metro*100;
				
		//Show the total length
		System.out.println("La longitud total es: " + resCent);
				
		//Close the Scanner
		reader.close();
	}

}
