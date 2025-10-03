package unit1;

import java.util.Scanner;
public class Exercise06 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declare the variables
		int num1;
		int num2;
		int rSum;
		int rRest;
		int rMult;
		int rDiv;
		
		//Ask for a number
		System.out.println("Introduce un número");
		num1 = reader.nextInt();
		
		//Ask for a second number
		System.out.println("Introduce un segundo número");
		num2 = reader.nextInt();
		
		//Calculate the addition, subtraction, multiplication and division between the numbers
		rSum = num1 + num2; 
		rRest =num1 - num2;
		rMult = num1 * num2;
		rDiv = num1 / num2;
		
		//Show the process of every calculations
		System.out.println("La suma de ambos números es " +  num1 + " + " + num2 + " = " + rSum);
		System.out.println("La resta de ambos números es " +  num1 + " - " + num2 + " = " + rRest);
		System.out.println("La multiplicación de ambos números es " +  num1 + " · " + num2 + " = " + rMult);
		System.out.println("La división de ambos números es " +  num1 + " / " + num2 + " = " + rDiv);
		
		//Close the Scanner
		reader.close();
	}

}
