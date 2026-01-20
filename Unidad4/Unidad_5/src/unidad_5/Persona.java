/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_5;


/**
 *
 * @author 06_1DAW_Alum
 */
public class Persona {
    
     //Atributo
    String nombre;
    String apellido;
    int edad;
    double estatura;
    diadelasemana dia;
    Sexo sexo;
    
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
    
}
