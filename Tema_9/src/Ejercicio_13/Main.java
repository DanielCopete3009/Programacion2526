package Ejercicio_13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {

	
	Persona miPersona = new Persona ("Jordi hurtado",999,1.67);

	
	try {
	FileOutputStream fichero = new FileOutputStream("persona.dat");
	ObjectOutputStream out = new ObjectOutputStream(fichero);
	
	out.writeObject(miPersona);
	
	out.close();
	
	System.out.println("Persona guardada correctamente");
	} catch (IOException e) {
		System.out.println("Erro al guardar");
	}
  }
}


