package ejercicio5Objeto;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//Creamos una collection TreeSet de tipo Producto
		TreeSet<Producto> collection = new TreeSet<Producto>();

		int opcion = 0; //Se guardara la opcion del usuario
		String nombre = ""; //Se guardara el nombre del producto
		double precio = 0; //Se guardara el precio del producto
		Producto p= null; //Se guardara el producto

		//Creamos el Scanner
		Scanner read = new Scanner(System.in);

		//Ordenamos que haga
		do {
			// Solicitamos alguna de estas opciones
			System.out.println("Seleccione alguna de las siguientes opciones");
			System.out.println(" 1. Alta de producto");
			System.out.println(" 2. Baja de producto");
			System.out.println(" 3. Listar existencias ");
			System.out.println(" 0. Salir");
			
			//Leemos
			opcion= read.nextInt();
			read.nextLine();
			
			//Creamos un switch 
			switch (opcion) {
			//En el caso 1:
			case 1:
				// Pedimos el nombre
				System.out.println("Introduzca el nombre del producto");
				nombre = read.next();
				read.nextLine();
				
				//Pedimos el precio
				System.out.println("Introduzca el precio del producto");
				precio= read.nextDouble();
				read.nextLine();
				
				//Creamos un objeto 
				p= new Producto (nombre,precio);
				//Añadimos el objeto a la collection
				collection.add(p);
				
				break;
			
			//En el caso 2	
			case 2: 
				// Pedimos el nombre
				System.out.println("Introduzca el nombre del producto");
				nombre = read.next();
				read.nextLine();
				
				//Pedimos el precio
				System.out.println("Introduzca el precio del producto");
				precio= read.nextDouble();
				read.nextLine();
				
				//Creamos el objeto
				p= new Producto (nombre,precio);
				
				//Si el producto se encuentra en la colletion, se eliminará
				if (collection.remove(p)) {
					//Y mostrará un mensaje de eliminado correctamente
					System.out.println("Producto eliminado correctamente");
				// En caso contrario
				} else {
					//Mostrará un mensaje de que no se encuentra
					System.out.println("No se ha podido eliminar el producto, compruebe que el producto se encuentre en el listado");
				}
				break;
				
			//En el caso 3	
			case 3: 
				//Mostramos los productos
				for (Producto productos: collection) {
					System.out.println(productos);
				}
			
				//En el caso 0 
			case 0:
				//Mostramos que se sale del programa
				System.out.println("Saliendo del programa");
				break;
				
			//En el caso default	
			default:
				//Mensaje de error
				System.err.println("Introduzca un opcion válida");
			}
		//Mientras que la opcion sea distinta de 0	
		} while (opcion != 0);

	}

}
