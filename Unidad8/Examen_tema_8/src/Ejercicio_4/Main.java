package Ejercicio_4;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		SortedSet<Producto> productos = new TreeSet<>();
		
		
		Producto a = new Producto(1, 22.93);
		Producto b = new Producto(2, 2.24);
		Producto c = new Producto(3, 32);
		Producto d = new Producto(4, 20.20);
		productos.add(a);
		productos.add(b);
		productos.add(c);
		productos.add(d);
		
		System.out.println(productos);
		
	}

}
