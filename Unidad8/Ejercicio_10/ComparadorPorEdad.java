package Ejercicio_10;

import java.util.Comparator;

import Ejercicio_2.Persona;

public class ComparadorPorEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona p1, Persona p2) {
		
		if (p1.getEdad() == p2.getEdad())
		return 0;
		if(p1.getEdad() > p2.getEdad())
			return 1;
		else
			return -1;
	}

}


/*
 * 	
 * Orden natural -> compareTo : Comparable
 * 
 * Orden Alternativo -> compare : Comparator
 * 
 * 
 * Se utiliza equals para comparar dos cadenas
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
 