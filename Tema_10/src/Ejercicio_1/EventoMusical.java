package Ejercicio_1;

public class EventoMusical {
	private String nombre;
	private int fecha;
	private Double recadudacion;
	
	public EventoMusical(String nombre, int fecha, Double recaudacion) {
		this.fecha = fecha;
		this.nombre = nombre;
		this.recadudacion= recaudacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
