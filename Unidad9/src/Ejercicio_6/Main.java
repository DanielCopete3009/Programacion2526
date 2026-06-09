package Ejercicio_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Cuantos años crees que viviras");
		int años = sc.nextInt();
		años = años + 10;
		System.out.println("hola  " + nombre + "los astros dicen que morirás a los " + años + "por culpa de un cafe");
	}

}


/*
 * Cuando en un programa de Java se utiliza primero nextInt() para leer un
 * número y después nextLine() para leer una cadena, aparece un comportamiento
 * inesperado: el programa parece “saltarse” la pregunta del nombre y no permite
 * al usuario escribir nada. Esto ocurre porque nextInt() únicamente lee el
 * número introducido por el usuario, pero no consume el salto de línea que se
 * genera al pulsar la tecla Enter. Ese salto de línea queda almacenado en el
 * buffer del teclado.
 * 
 * Cuando el programa ejecuta a continuación nextLine(), este método interpreta que ese salto de línea pendiente es una línea vacía válida, por lo que no espera a que el usuario escriba su nombre y devuelve directamente una cadena vacía. El resultado es que el programa continúa como si el usuario hubiera introducido un nombre en blanco.
 * 
 * Para evitar este problema, es necesario limpiar el buffer después de usar nextInt(). Esto se consigue añadiendo una llamada adicional a nextLine() inmediatamente después de leer el número. Esa llamada extra consume el salto de línea sobrante y permite que la siguiente lectura con nextLine() funcione correctamente, dejando al usuario escribir su nombre sin interrupciones.
 */