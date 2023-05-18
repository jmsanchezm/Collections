package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Se guardará el número que introduzca el usuario
		int num = 0;

		//Creamos las collections, en este caso serán mapas
		TreeMap<Integer, Integer> numero = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> estrella = new TreeMap<Integer, Integer>();

		//Creamos el Scanner
		Scanner read = new Scanner(System.in);

		//Solicitamos los números
		System.out.println("Introduzca los 5 números del euromillon y luego las dos estrellas");
		for (int i = 0; i < 7; i++) {
			//Leemos el dato
			num = read.nextInt();
			//Si la i es menor a 5, 
			if (i < 5) {
				//Si el número no se encuentra en el mapa
				if (!numero.containsKey(num)) {
					//Se añadirá el número
					numero.put(num, 1);
				} 
				//De lo contrario
				else {
					//Reemplazará el número y añadirá uno al valor
					numero.replace(num, (int) numero.get(num) + 1);
				}
			//De lo contrario, si el número es mayor a 5, 	
			} else {
				//Si estrella no contiene el número 
				if (!estrella.containsKey(num)) {
				//Se añadirá en las estrellas
				estrella.put(num, 1);
				
				//De lo contrario
				}else {
					//Reemplazará la clave y al valor le sumará 1
					estrella.replace(num, (int)estrella.get(num)+1);
				}
			}
		}

		//Mostramos los números por pantalla
		System.out.println(numero + " " + estrella);
	}

}
