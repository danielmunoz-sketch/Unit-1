package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declared a variable for the radio of the circle and it length and area
		int radio;
		double length;
		double area;
		
		//Ask the radio
		System.out.println("Introduzca el radio:");
		radio = reader.nextInt();
		
		//Calculate the length and the area
		length = 2 * radio * Math.PI;
		area = Math.PI * Math.pow(radio, 2);
		
		//Show the length and the area in cm 
		System.out.println("Su longitud es de " + length + "cm y su area de " + area + "cm");
		
		//Close the Scanner
		reader.close();


	}

}
