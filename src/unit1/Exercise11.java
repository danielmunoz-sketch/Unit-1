package unit1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declare the variables 
		double euros;
		double pesetas;
		
		//Ask the variable pesetas
		System.out.println("Introduzca el número de pesetas:");
		pesetas= reader.nextInt();
		
		//Convert the number of pesetas into euros
		euros = pesetas/166 ;
		
		//Show the number of euros
		System.out.println("Esto son " + euros + " €");
		
		//Close the Scanner
		reader.close();

	}

}
