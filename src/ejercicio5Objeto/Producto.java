package ejercicio5Objeto;

import java.util.Objects;

public class Producto implements Comparable <Producto> {

	private String nombre;
	private double precio;

	public Producto() {
		super();

	}

	public Producto(String nombre, double precio) {
		super();
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		String res = "Producto: "+  nombre + ", precio: " + precio;
		return res;
	}

	@Override 
	public boolean equals (Object obj) {
		boolean res= false;
		Producto pro = (Producto)obj ;
		if (this.nombre.equals(pro.nombre)) {
			res=true;
		}
		return res;
	}

	@Override
	public int compareTo(Producto o) {
		int res =0;
		res= this.nombre.compareTo(o.nombre);
		return 0;
	}

	
	
}
