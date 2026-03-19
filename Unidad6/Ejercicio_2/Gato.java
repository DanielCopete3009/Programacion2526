package Ejercicio_2;

public class Gato extends AnimalBase implements Animal {

	public Gato(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("miau");
	}
	
	@Override
	public void comer() {
		System.out.println("Comiendo pescado");
	}

}
