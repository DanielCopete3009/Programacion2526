/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ud_4;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Usuario {
    // Atributos
    String dni;
    String nombre;
    int edad;
    
     // Constructor
    public Usuario(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
    // Métodos
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
