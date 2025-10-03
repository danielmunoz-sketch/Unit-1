package unit1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Declare the int's and double variables
		int notaPrimTrim;
		int notaSegTrim;
		int notaTerTrim;
		double mediaExpediente;
		int mediaBoletin;
		
		//Ask the first quarter mark
		System.out.println("Introduzca la nota del primer trimestre:");
		notaPrimTrim = reader.nextInt();
		
		//Ask the second quarter mark
		System.out.println("Introduzca la nota del segundo trimestre:");
		notaSegTrim = reader.nextInt();
		
		//Ask the third quarter mark
		System.out.println("Introduzca la nota del tercer trimestre:");
		notaTerTrim = reader.nextInt();
		
		//Calculate the expedient average
		mediaExpediente = (double) ((notaPrimTrim + notaSegTrim + notaTerTrim)) / 3;
		
		//Calculate the bulletin average
		mediaBoletin = (int) (mediaExpediente);
		
		//Show the expedient average
		System.out.println("La nota media del expediente es de " + mediaExpediente);
		
		//Show the bulletin average
		System.out.println("La nota media del boletin de calificaciones es de " + mediaBoletin);
		
		//Close the Scanner
		reader.close();
	}

}
