package Ejercicio_2;

public class Vaca extends AnimalBase implements Animal {
	
	public Vaca(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("muuuuu");
	}
	
	@Override
	public void comer() {
		System.out.println("Comiendo Pasto");
	}
}
