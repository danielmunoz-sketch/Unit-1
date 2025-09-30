package unit1_part2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//
		int a;
		int b;
		int c;
		int x;
		int y;
			
		//
		System.out.println("Introduce el valor de a");
		a = reader.nextInt();
				
		//
		System.out.println("Introduce el valor de b");
		b = reader.nextInt();
			
		//
		System.out.println("Introduce el valor de c");
		c = reader.nextInt();
				
		//
		System.out.println("Introduce el valor de x");
		x = reader.nextInt();
		
		//
		y = (int) ((a*(Math.pow(x, 2))) + (b*x) + c);
				
		//
		System.out.println("y es igual a: " + y);
				
		//Close the Scanner
		reader.close();
	}

}
