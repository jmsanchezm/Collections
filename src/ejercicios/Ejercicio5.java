package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int opcion = 0; // Se guardara la opcion del usuario
		String nombreProducto = " "; // Se guardara el nombre del producto
		double precio = 0; // Se guardara el precio del producto
		int stock = 0; // Se guardara el stock del ptroducto

		// Creamos dos colecciones, una de tipo HashMap y otra de tipo ArrayList
		HashMap<String, Double> productos = new HashMap<String, Double>();

		// Creamos el Scanner
		Scanner read = new Scanner(System.in);

		// Ordenamos que haga
		do {
			// Solicite alguna de estas opciones
			System.out.println("Seleccione alguna de las siguientes opciones");
			System.out.println(" 1. Alta de producto");
			System.out.println(" 2. Baja de producto");
			System.out.println(" 3. Listar existencias ");
			System.out.println(" 0. Salir");

			// Leemos el dato
			opcion = read.nextInt();

			// Creamos un switch
			switch (opcion) {
			// En el caso 1
			case 1:
				// Pedimos el nombre
				System.out.println("Introduzca el nombre del producto");
				nombreProducto = read.next();

				// Pedirá el precio
				System.out.println("Introduzca el precio del producto");
				precio = read.nextDouble();

				// Lo añade a las collections
				productos.put(nombreProducto, precio);

				// Mensaje
				System.out.println("Producto añadido correctamente");

				break;

			// En el segundo caso
			case 2:
				// Pedimos el nombre
				System.out.println("Introduzca el nombre del producto a dar de baja");
				nombreProducto = read.next();
				
				//Si el nombre del producto se encuentra en la collection producto
				if (productos.containsKey(nombreProducto)) {
					//Se eliminará el producto
					productos.remove(nombreProducto);
				//De lo contrario
				}else {
					//Mostrará un mensaje de error
					System.out.println("El producto no se encuentra");
				}
				break;

			// En el tercer caso
			case 3:
				// Mostramos el contenido de las collections
				System.out.println("Productos" + productos);
				break;

			// En el caso de que sea 0
			case 0:
				// Mostramos que salimos del programa
				System.out.println("Saliendo del programa...");
				break;

			}
			// Mientras que la opcion sea distinta de 0
		} while (opcion != 0);

		read.close();

	}

}
