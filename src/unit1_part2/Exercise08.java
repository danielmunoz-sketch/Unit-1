package unit1_part2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//
		double metros;
		double cent;
			
		//
		System.out.println("Introduce una longitud en metros");
		metros = reader.nextDouble();
				
		
		//
		cent = metros*100;
		cent = (int) cent;
				
		//
		System.out.println("La longitud en centimetros es: " + (int) cent + " cm");
				
		//Close the Scanner
		reader.close();
	}
}
