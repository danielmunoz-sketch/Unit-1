package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//Declared a variable for the number that the user will introduce
		int radio;
		double longcircle;
		double area;
		//
		System.out.println("Introduzca el radio:");
		//
		radio = reader.nextInt();
		//
		longcircle = 2 * radio * Math.PI;
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("Su longitud es de " + longcircle + "cm y su area de " + area + "cm");
		//
		reader.close();


	}

}
