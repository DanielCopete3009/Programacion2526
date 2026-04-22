package Ejercicio_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Club_Lectura {
	private Set<String> biblioteca;
	
	public Club_Lectura() {
		this.biblioteca = new HashSet<>();
	}
	
	public void agregarLibro (String libro) {
		biblioteca.add(libro);
	}
	
	public void mostarBiblioteca() {
		Iterator<String> it = biblioteca.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	
	
	
	
	
}
