package Ejercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca varios caracteres después pulse intro para finalizar:  ");
	
		String cadena = sc.nextLine();
		
		
		System.out.println("Tus caracteres : " + cadena);
	
	//última parte
		
		String nombre = sc.nextLine();
		System.out.println("Introduce tu nombre: " + nombre);
		System.out.println("Hola mundo " + nombre );
	
	}

}
