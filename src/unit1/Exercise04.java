package unit1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declared a variable for the numbers that the user will introduce
		int firstMark;
		int secondMark;
		float result;
		
		//Ask the one of the marks
		System.out.println("Introduzca una nota:");
		firstMark = reader.nextInt();
		
		//Ask the other mark
		System.out.println("Introduzca otra nota:");
		secondMark = reader.nextInt();
		
		//Calculate the average 
		result = (firstMark + secondMark) / 2;
		
		//Show the message with the average of the marks
		System.out.println("Su media es de: " + result);
		
		//Close the Scanner
		reader.close();

	}

}
