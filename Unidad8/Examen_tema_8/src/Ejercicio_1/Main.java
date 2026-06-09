package Ejercicio_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> listapacientes = new LinkedList();
		// Creando una lista linkedlist nos aseguramos que los objetos se guardan en orden de insercción
		
	
		listapacientes.add("fran");
		listapacientes.add("raul");
		listapacientes.add("dani");
		listapacientes.add("pino");
		listapacientes.add("david");
		
		System.out.println("Estos son los pacientes" + listapacientes);
	
		mostrarnombres(listapacientes);
	
	}

	//creamos un método fuera del main, el main es un método estatico por lo que solo debe recibir otros metodos que sea estaticos no otra manera no dejaria
	//Este metodo mostrar nombres recibe la lista de pacientes como  parametro dentro del metodo creamos un for-each para que muestre los pacientes de manera ordenada
		public static void mostrarnombres (List<String> listapacientes) {
			for(String n : listapacientes  ) {
				System.out.println(n);
			}
		}
	
	
}
