package Ejercicio_2;

import Ejercicio_2.Persona.Sexo;

public class Ciudad {
	
	public static void main(String[] args) {
		Persona juan = new Persona("Juan", "Pérez",20,1.8f,Persona.Sexo.MASCULINO);
		juan.setNombre("Juana");
		System.out.println(juan.getApellido());
		
		juan.setSexo(Sexo.FEMENINO);
		System.out.println(juan.getSexo());
		
		juan.setEdad(-1);
		System.out.println(juan.getEdad());
		
	}
	

}
