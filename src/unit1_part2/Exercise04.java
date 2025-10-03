package unit1_part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//Declare the variables for the numbers that the user will introduce
		int a;
		int b;
		int c;
		int x;
		int y;
			
		//Ask for the values of each variable
		System.out.println("Introduce el valor de a");
		a = reader.nextInt();
		System.out.println("Introduce el valor de b");
		b = reader.nextInt();
		System.out.println("Introduce el valor de c");
		c = reader.nextInt();
		System.out.println("Introduce el valor de x");
		x = reader.nextInt();
		
		//Calculate the value of the variable y
		y = (int) ((a*(Math.pow(x, 2))) + (b*x) + c);
				
		//Show the value of y
		System.out.println("y es igual a: " + y);
				
		//Close the Scanner
		reader.close();
	}

}
