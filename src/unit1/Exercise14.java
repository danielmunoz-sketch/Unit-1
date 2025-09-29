package unit1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		
		//
		int notaPrimTrim;
		int notaSegTrim;
		int notaTerTrim;
		double mediaExpediente;
		int mediaBoletin;
		
		//
		System.out.println("Introduzca la nota del primer trimestre:");
		notaPrimTrim = reader.nextInt();
		
		//
		System.out.println("Introduzca la nota del segundo trimestre:");
		notaSegTrim = reader.nextInt();
		
		//
		System.out.println("Introduzca la nota del tercer trimestre:");
		notaTerTrim = reader.nextInt();
		
		//
		mediaExpediente = (double) ((notaPrimTrim + notaSegTrim + notaTerTrim)) / 3;
		
		//
		mediaBoletin = (int) (mediaExpediente);
		
		//
		System.out.println("La nota media del expediente es de " + mediaExpediente);
		
		//
		System.out.println("La nota media del boletin de calificaciones es de " + mediaBoletin);
		
		//
		reader.close();
	}

}
