/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_2_ciudad;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Persona {

    String nombre;
    int edad;
    double estatura;
   
    void saludar(){
        System.out.print("hola");
       }
    void cumplir(){
        edad = edad +1;
    }
    void crecer(double incremento){
        estatura = estatura + incremento;
    }
}
