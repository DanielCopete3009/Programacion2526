package Ejercicio_2;

public class Pajaro extends AnimalBase implements Animal,Volador{

	public Pajaro(String nombre) {
		super(nombre);
	}

	@Override
	public void volar() {
		System.out.println("Vuela");
	}

	@Override
	public void hacerSonido() {
		System.out.println("pio");
	}

	@Override
	public void comer() {
		System.out.println("Alpiste");
	}

}
