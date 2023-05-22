package ejercicios;

import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos una coleccion de tipo LinkedHashSet que permita los tipo Integer
		LinkedHashSet<Integer> coleccion = new LinkedHashSet<Integer>() ;
		
		int numero=0; //Se guardara el numero generado
	
		//Mientras que el tamaño de la coleccion sea menor que 20
		while( coleccion.size() <20) {
			//Generamos el número aleatorio
			numero = (int)(Math.random()*101);
			//Y la añadimos el numero a la coleccion
			coleccion.add(numero);
		}

		//Mostramos el resultado al salir del bloque
		System.out.println(coleccion);
	}

}
