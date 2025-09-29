package unit1;

import java.util.Scanner;
public class Exercise06 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//
		int num1;
		int num2;
		int rSum;
		int rRest;
		int rMult;
		int rDiv;
		
		//
		System.out.println("Introduce un número");
		num1 = reader.nextInt();
		
		//
		System.out.println("Introduce un segundo número");
		num2 = reader.nextInt();
		
		//
		rSum = num1 + num2; 
		rRest =num1 - num2;
		rMult = num1 * num2;
		rDiv = num1 / num2;
		
		//
		System.out.println("La suma de ambos números es " +  num1 + " + " + num2 + " = " + rSum);
		//
		System.out.println("La resta de ambos números es " +  num1 + " - " + num2 + " = " + rRest);
		//
		System.out.println("La multiplicación de ambos números es " +  num1 + " · " + num2 + " = " + rMult);
		//
		System.out.println("La división de ambos números es " +  num1 + " / " + num2 + " = " + rDiv);
		
		//Close the Scanner
		reader.close();
	}

}
