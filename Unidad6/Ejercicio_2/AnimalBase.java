package Ejercicio_2;

public abstract class AnimalBase implements Animal {
	  
	protected String nombre; // Se puede heredar

	   public AnimalBase(String nombre) {
	       this.nombre = nombre;
	   }

	   public void mostrarNombre() { // método concreto pq tiene un cuerpo

	       System.out.println("Nombre: " + nombre);

	   }
}
