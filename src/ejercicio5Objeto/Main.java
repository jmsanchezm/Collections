package ejercicio5Objeto;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Producto> collection = new TreeSet<Producto>();

		int opcion = 0;
		String nombre = "";
		double precio = 0;
		Producto p= null;

		Scanner read = new Scanner(System.in);

		do {
			// Solicite alguna de estas opciones
			System.out.println("Seleccione alguna de las siguientes opciones");
			System.out.println(" 1. Alta de producto");
			System.out.println(" 2. Baja de producto");
			System.out.println(" 3. Listar existencias ");
			System.out.println(" 0. Salir");
			
			opcion= read.nextInt();
			read.nextLine();
			
			switch (opcion) {
			case 1:
				// Pedimos el nombre
				System.out.println("Introduzca el nombre del producto");
				nombre = read.next();
				read.nextLine();
				
				System.out.println("Introduzca el precio del producto");
				precio= read.nextDouble();
				read.nextLine();
				
				p= new Producto (nombre,precio);
				
				if (collection.add(p)) {
					System.out.println("Producto añadido");
					
				}else {
					System.out.println("No se ha podido añadir el producto");
				}
			case 2: 
				// Pedimos el nombre
				System.out.println("Introduzca el nombre del producto");
				nombre = read.next();
				read.nextLine();
				
				System.out.println("Introduzca el precio del producto");
				precio= read.nextDouble();
				read.nextLine();
				
				p= new Producto (nombre,precio);
				
				if (collection.remove(p)) {
					System.out.println("Producto eliminado correctamente");
					
				} else {
					
				}
				
				
			}
			
		} while (opcion != 0);

	}

}
