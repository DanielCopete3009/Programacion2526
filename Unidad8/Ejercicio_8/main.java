package Ejercicio_8;

import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new TreeSet<>();
		
		// Añadir números en orden aleatorio
		
		numeros.add(7);
		numeros.add(5);
		numeros.add(9);
		numeros.add(2);
		
		// Recorrer e imprimir ordenado (menor a mayor)
		
		for (Integer num : numeros) {
			System.out.println(numeros); 
			// TreeSet los ordena
		}
		
		
		// Haz lo mismo con nombres de alumnos
		
		Set<String> alumnos = new TreeSet<>();

		alumnos.add("Alejandra");
		alumnos.add("Fran");
		alumnos.add("Dani");

		for (String alumno : alumnos) {
		    System.out.println(alumno);
		}
	}

}
