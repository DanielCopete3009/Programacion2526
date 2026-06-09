package Ejercicio_2;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<Integer> codigos = new HashSet<>();
		// El conjunto Hashset es el más eficiente a la hora de guardar información debido a que no garantiza el orden de inserción y estas desordenado el conjunto 
		//de manera que si yo quiero mostrar el conjunto en pantalla siempre que lo quiera volver a mostrar se mostrara de manera aleatoria
		
		codigos.add(1);
		codigos.add(10);
		codigos.add(113);
		codigos.add(1);  // como podemos ver he añadido duplicados pero  no va a resultar un problema ya que este  cojunto no permite duplicados
		codigos.add(12);
		codigos.add(13);
		codigos.add(1);
	
		System.out.println(codigos);
		System.out.println("Mostrando los códigos de manera uniforme");	mostrarcodigo(codigos);
		
	}
//creamos un método fuera del main, el main es un método estatico por lo que solo debe recibir otros metodos que sea estaticos no otra manera no dejaria
	// Este metodo recibe de parametros el conjuto  de codigos y los va mostrando uno a uno de manera ordenada
	public static void mostrarcodigo(Set<Integer>codigos) {
		for(Integer n : codigos  ) {
			System.out.println(n);
			
		}
	}
}
