package Ejercicio_12;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		numeros.add(50);
		numeros.add(60);
		numeros.add(70);
		numeros.add(80);
		numeros.add(90);
		numeros.add(100);
		
		ListIterator<Integer> it = numeros.listIterator();
		while(it.hasNext()) {
			Integer num = it.next();
			if (num > 50) {
				it.set(num * 2);

			}
			System.out.println(numeros);
		}

		while (it.hasPrevious()) {
		    int valor = it.previous();

		    if (valor < 30) {
		        it.add(25);
		        it.previous();		    }
		    
		}
		System.out.println(numeros);

	}
}
