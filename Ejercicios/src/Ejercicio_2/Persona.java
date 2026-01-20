package Ejercicio_2;

public class Persona {
	 //Atributo
    public String nombre;
    private String apellido;
    private int edad;
    private double estatura;
    private diadelasemana dia;
    private Sexo sexo;
    
    //Parte 4 constructor que asigna valores a todos los atributos Persona
    //Constructores
    
    Persona (String nombre, int edad, double estatura){ //Constructor con parámetros 
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    Persona() { //Constructor por defecto
      
    }
    
    Persona(String nombre) {
        this.nombre = nombre;
    }
    
    
    Persona (String nombre, String apellido, int edad, double estatura){ //Constructor con parámetros 
          this(nombre + apellido, edad, estatura);
          this.apellido = apellido;
      }
      
  
    Persona(String nombre, String apellido, int edad, double estatura, Sexo sexo){
        this(nombre + apellido, edad, estatura);
        this.sexo = sexo;
     
    
    }
    

    void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    void cumplir() {
        edad = edad + 1;
    }

    void crecer(double incremento) {
        estatura = estatura + incremento;
    }

    public enum Sexo {
    MASCULINO, FEMENINO, NO_BINARIO
}
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }

    public Sexo getSexo() {
    	return sexo;
    }
    
    public void setSexo(Sexo s ) {
    	this.sexo = s;
  
    }

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public diadelasemana getDia() {
		return dia;
	}

	public void setDia(diadelasemana dia) {
		this.dia = dia;
	}
    }
