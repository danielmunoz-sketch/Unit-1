package unit1_part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//
		int seg;
		int segask; 
		int min;
		int hor;
			
		//
		System.out.println("Introduce una cantidad de segundos");
		segask = reader.nextInt();
					
		//
		hor= segask >= 3600 ? segask/3600 : 0;
		
		//
		int resthor = segask%3600;
		min= segask >= 60 ? resthor/60 : 0;
		
		//
		int restmin = segask%60;
		seg=  segask >= 60 ? restmin : 0;
				
		//
		System.out.println("El tiempo total en horas minutos y segundos es: " + hor + " horas, " + min + " minutos, " + seg + " segundos.");
				
		//Close the Scanner
		reader.close();
	}

}
