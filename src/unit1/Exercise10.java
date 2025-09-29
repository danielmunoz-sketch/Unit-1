package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declare the variables for the number and the boolean variable called par to check if the number is par
		int num;
		boolean par;
		
		//Ask the variable number
		System.out.println("Introduzca un número:");
		num= reader.nextInt();
		
		//Set the variable par is true if the rest of the number divided by 2 is 0
		par= num%2 == 0;
		
		//Show if the number is par (true) or not (false)
		System.out.println("¿Es un número par? " + par);
		
		//Close the Scanner
		reader.close();

	}

}
