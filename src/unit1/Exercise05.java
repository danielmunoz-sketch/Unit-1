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
		//
		System.out.println("Introduzca el radio:");
		//
		radio = reader.nextInt();
		//
		length = 2 * radio * Math.PI;
		area = Math.PI * Math.pow(radio, 2);
		//
		System.out.println("Su longitud es de " + length + "cm y su area de " + area + "cm");
		//Close the Scanner
		reader.close();


	}

}
