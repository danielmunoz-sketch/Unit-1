package unit1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner reader = new Scanner(System.in);
		//
		String nombre;
		String direccion;
		String numero;
		//
		System.out.println("Introduzca su nombre");
		nombre=reader.nextLine();
		//
		System.out.println("Introduzca su dirección");
		direccion=reader.nextLine();
		//
		System.out.println("Introduzca su número");
		numero=reader.nextLine();
		//
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Número: " + numero);
		//Close the Scanner
		reader.close();
	}

}
