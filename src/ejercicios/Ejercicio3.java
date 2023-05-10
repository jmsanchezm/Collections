package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos la lista de tipo TreeSet, que acepte tipo Strings
		TreeSet<String> collection = new TreeSet<String>();

		String palabra = ""; // Se guardara la palabra que vaya introduciendo

		// Creamos el Scanner
		Scanner read = new Scanner(System.in);

		// Solicitamos la palabra
		System.out.println("Introduzca palabras. ");
		System.out.println("Se le mostrará los resultados al introducir la palabra fin");

		// Leemos la palabra
		palabra = read.next();
		read.nextLine();

		// Mientras que la palabra sea distinta de fin
		while (!palabra.equals("fin")) {
			// Añadimos la palabra
			collection.add(palabra);
			// Y leemos otra
			palabra = read.next();
			read.nextLine();
		}

		// Mostramos el resultado al salir del bucle
		System.out.println(collection);

	}

}
