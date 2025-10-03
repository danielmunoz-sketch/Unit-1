package unit1_part2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//Declare the variables
		double metros;
		double cent;
			
		//Ask the length in meters
		System.out.println("Introduce una longitud en metros");
		metros = reader.nextDouble();
				
		
		//Calculate the length in centimeters
		cent = metros*100;
		cent = (int) cent;
				
		//Show the length in centimeters
		System.out.println("La longitud en centimetros es: " + (int) cent + " cm");
				
		//Close the Scanner
		reader.close();
	}
}
