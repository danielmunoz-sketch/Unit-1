package unit1_part2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
				
		//Declare the variables 
		int seg;
		int segask; 
		int min;
		int hor;
			
		//Ask the seconds
		System.out.println("Introduce una cantidad de segundos");
		segask = reader.nextInt();
					
		//Convert seconds to hours
		hor= segask >= 3600 ? segask/3600 : 0;
		
		//Convert the remaining time from the conversion of hours to minutes
		int resthor = segask%3600;
		min= segask >= 60 ? resthor/60 : 0;
		
		//Convert the remaining time from the conversion of minutes to seconds
		int restmin = segask%60;
		seg=  segask >= 60 ? restmin : 0;
				
		//Show the hours minutes and seconds
		System.out.println("El tiempo total en horas minutos y segundos es: " + hor + " horas, " + min + " minutos, " + seg + " segundos.");
				
		//Close the Scanner
		reader.close();
	}

}
