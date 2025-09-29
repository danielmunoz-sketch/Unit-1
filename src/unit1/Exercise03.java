package unit1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declared a variable for the number that the user will introduce
		int actYear;
		int bornYear;
		int age;
		
		//Ask the actual year
		System.out.println("Introduzca el año actual:");
		actYear = reader.nextInt();
		
		//Ask the born year
		System.out.println("Introduzca el año de nacimiento:");
		bornYear = reader.nextInt();
		
		//Calculate the age with the actual year and the born year
		age = actYear - bornYear;
		
		//Show the message with the years
		System.out.println("Tienes " + age + " años");
		
		//Close the Scanner
		reader.close();

	}
}
