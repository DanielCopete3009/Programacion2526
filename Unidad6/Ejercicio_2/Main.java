package Ejercicio_2;

public class Main {

	public static void main(String[] args) {
		
		Perro p1 = new Perro("p1");
		Gato g1 = new Gato("g1");
		Vaca v1 = new Vaca("v1");
		Perro p2 = new Perro("p2");
		Pajaro pa1 = new Pajaro("pa1");
		
		
		p1.mostrarNombre();
		
		Animal[] animales = new Animal[5];
		
		animales[0] = p1;
		animales[1] = g1;
		animales[2] = v1;
		animales[3] = p2;
		animales[4] = pa1;
	
	
		for(Animal animal : animales) { // El for es un bucle for-each
		
		// Si el animal implementa la interfaz Volador, lo convertimos a Volador y llamamos a su método volar()	
		if (animal instanceof Volador)
			((Volador) animal).volar();
			
			
			
		AnimalBase animalBase = (AnimalBase)animal; // llamado Casting es una  Conversión de tipos
		animal.hacerSonido();// Animal es el tipo de la variable que es una interfaz, 
		animal.comer();                     // animal es una variable temporal 
							// animales el array que va a recorrer
		}

	}
	
}
