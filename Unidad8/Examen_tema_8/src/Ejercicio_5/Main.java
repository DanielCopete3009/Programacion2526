package Ejercicio_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main (String args[]) {
		Set<Integer> numeros = new TreeSet<>();
		
		numeros.add(54);
		numeros.add(7);
		numeros.add(3245);
		numeros.add(78);
		numeros.add(235);
		numeros.add(8);
		
		for(Integer n : numeros  ) {
			System.out.println(n);
		}
	}
	
	public static void eliminarnum(Set<Integer> numeros) {
		Iterator<Integer> it =  numeros.iterator();
		
		while(it.hasNext()) {
			Integer n = it.next();
			if ( n < 300) {
				numeros.remove(n);
			}else {
				System.out.println(n);
			}
		}
	}
}
