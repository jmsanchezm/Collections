package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num = 0;

		TreeMap<Integer, Integer> numero = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> estrella = new TreeMap<Integer, Integer>();

		Scanner read = new Scanner(System.in);

		System.out.println("Introduzca los 5 números del euromillon y luego las dos estrellas");
		for (int i = 0; i < 7; i++) {
			num = read.nextInt();
			if (i < 5) {
				if (!numero.containsKey(num)) {
					numero.put(num, 1);
				} 
				else if (numero.containsKey(num)) {
					numero.replace(num, (int) numero.get(num) + 1);
				}
			} else {
				estrella.put(num, 1);
			}
		}

		System.out.println(numero + " " + estrella);
	}

}
