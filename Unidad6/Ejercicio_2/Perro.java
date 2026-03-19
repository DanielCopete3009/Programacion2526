package Ejercicio_2;

public class Perro extends AnimalBase implements Animal  {

	@Override
	public void hacerSonido() {
		System.out.println("Guau!");
	}
	
	
	public Perro(String nombre) {
		super(nombre);
	}
	
	@Override
	public void comer() {
		System.out.println("Comiendo carne");
	}
}
