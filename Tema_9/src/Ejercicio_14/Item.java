package Ejercicio_14;

import java.io.Serializable;

public class Item implements Serializable {
	private String nombre;
	private int peso;
	private double valor;
	
	
	
	public Item (String nombre, int peso , double valor) {
		this.nombre = nombre;
		this.peso = peso;
		this.valor = valor;
		
	}
	
		
}
