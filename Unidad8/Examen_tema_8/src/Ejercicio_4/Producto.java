package Ejercicio_4;

public class Producto implements Comparable<Producto> {
	private int id;
	private double precio;
	
	
	Producto(int id , double precio){
		this.id = id;
		this.precio = precio;
	}


	protected int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}


	protected double getPrecio() {
		return precio;
	}


	protected void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public int compareTo(Producto o) {
		if (this.precio > o.precio) {
			return 1;
		}
		if (this.precio < o.precio) {
			return -1;
		}
		return 0;
	}
}
