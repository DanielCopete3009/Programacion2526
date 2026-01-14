/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

import java.time.Year;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Vehiculo {
    // Atributos privados
    private String matricula;
    private String marca;
    private int anioFabricacion;
    private double precio;
    private TipoVehiculo tipo;

    //constructor
    public Vehiculo(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.tipo = tipo;
    }
    // Muestra toda la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Año de fabricación: " + anioFabricacion);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Tipo: " + tipo);

    }   
    // Devuelve true si el vehículo tiene más de 10 años
    public boolean esAntiguo() {
        int anioActual = Year.now().getValue();
        return (anioActual - anioFabricacion) > 10;
    }
    // Aplica un descuento al precio
    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
    }
}
