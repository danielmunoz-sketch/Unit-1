package unit1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner (System.in);
		
		//Declare the boolean variables
		boolean biblioteca;
		boolean lloviendo;
		boolean tareas;
		boolean salir;
		
		//Ask if it's raining
		System.out.println("¿Está lloviendo?");
		lloviendo= reader.nextBoolean();
		
		//Ask if have to go to the library
		System.out.println("¿Tienes que ir a la bibloteca?");
		biblioteca= reader.nextBoolean();
		
		//Ask if have to do the tasks
		System.out.println("¿Has hecho las tareas?");
		tareas= reader.nextBoolean();
		
		//If it's raining and have to do tasks or have to go to the library go out it's true
		salir= (lloviendo && tareas) || biblioteca;
		
		//It show if go out it's true or false
		System.out.println("¿Puedes salir? " + salir);
		
		//Close the scanner
		reader.close();
	}

}
