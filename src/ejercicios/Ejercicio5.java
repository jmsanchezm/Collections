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
		ArrayList<Integer> existencias = new ArrayList<Integer>();

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

				// Mientras el nombre esté en el mapa,
				while (productos.containsKey(nombreProducto)) {
					// Le solicitará de nuevo el dato
					System.out.println("Por favor, introduzca un nombre que no se encuentre en el listado ya");
					nombreProducto = read.next();
				}

				// Pedirá el precio
				System.out.println("Introduzca el precio del producto");
				precio = read.nextDouble();

				// Pedirá el stock
				System.out.println("Introduzca el número  de existencias del producto");
				stock = read.nextInt();

				// Lo añade a las collections
				productos.put(nombreProducto, precio);
				existencias.add(stock);

				// Mensaje
				System.out.println("Producto añadido correctamente");

				break;

			// En el segundo caso
			case 2:
				// Pedimos el nombre
				System.out.println("Introduzca el nombre del producto a dar de baja");
				nombreProducto = read.next();
				// Mientras que el nombre del producto no se encuentre en el mapa
				while (!productos.containsKey(nombreProducto)) {
					// Pediremos el nombre del producto
					System.out.println("Introduzca un producto válido");
					nombreProducto = read.next();
				}

				// Eliminamos el producto
				productos.remove(nombreProducto);
				existencias.remove(stock);
				break;

			// En el tercer caso
			case 3:
				// Mostramos el contenido de las collections
				System.out.println("Productos" + productos);
				System.out.println("Existencias:" + existencias);
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
