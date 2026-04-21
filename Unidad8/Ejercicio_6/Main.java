package Ejercicio_6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        
        // HashSet para almacenar países únicos
        Set<String> paises = new HashSet<>();
        
        // Bucle para pedir 5 países
        for (int i = 0; i < 5; i++) {
            
            System.out.print("Introduce el país " + (i + 1) + ": ");
            String pais = scanner.nextLine();
            
            // Comprobamos si ya existe en el HashSet
            if (paises.contains(pais)) {
                System.out.println("¡Ese ya pasó por la frontera!");
            } else {
                // Si no existe, lo añadimos
                paises.add(pais);
            }
        }
        
        // Mostramos cuántos países únicos hay
        System.out.println("Hay " + paises.size() + " países únicos.");
        
        // Cerramos el scanner (buena práctica)
        scanner.close();
	}

}
