package Ejercicio_7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// Crear un conjunto vacío
		Set<String> alumnos = new LinkedHashSet<>();
		
		alumnos.add("Cristian");
		alumnos.add("Pino");
		alumnos.add("Luis");
		alumnos.add("Ana");
		alumnos.add("Fran");
		
		System.out.println(alumnos); 
		
		// Añade un nombre repetido
		
		alumnos.add("Fran");
		
		System.out.println(alumnos);   
		
		// Añade un null
		
		alumnos.add(null);
		
		System.out.println(alumnos); // Permite valores nulos
		
		// Recorre el conjunto imprimento sus elementos en orden
		
		for (String alumno : alumnos) {
			System.out.println("D  " +  alumno);
		}
		
		
		Set<String> alumnosHash = new HashSet<>();
		alumnosHash.add("Ana");
		alumnosHash.add("Jesus");
		alumnosHash.add("Mau");
	}

}
