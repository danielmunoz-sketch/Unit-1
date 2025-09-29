package unit1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		//
		Scanner reader = new Scanner (System.in);
		
		//
		boolean biblioteca;
		boolean lloviendo;
		boolean tareas;
		boolean salir;
		
		//
		System.out.println("¿Está lloviendo?");
		lloviendo= reader.nextBoolean();
		
		//
		System.out.println("¿Tienes que ir a la bibloteca?");
		biblioteca= reader.nextBoolean();
		
		//
		System.out.println("¿Has hecho las tareas?");
		tareas= reader.nextBoolean();
		
		//
		salir= (lloviendo && tareas) || biblioteca;
		
		//
		System.out.println("¿Puedes salir? " + salir);
		
		//
		reader.close();
	}

}
