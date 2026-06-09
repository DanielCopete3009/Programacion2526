package Ejercicio_13;

import java.io.Serializable;

public class Persona implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private int edad;
	private double estatura;
	
	
	public Persona(String nombre, int edad,double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	private transient Object conexion;
	
	
    @Override
    public String toString() {
        return nombre + " - Edad: " + edad + " - Altura: " + estatura;
    }
}
