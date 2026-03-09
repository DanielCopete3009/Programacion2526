/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud4;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Vehiculo {
    
    String matricula;
    String marca;
    int anioFabricacion;
    double precioDia;
    TipoVehiculo tipo;
    
    
    public Vehiculo(String matricula, String marca, int anioFabricacion, TipoVehiculo tipo) {
        this.matricula = matricula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;
    }

    Vehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Vehiculo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    void mostrarDatos(){
    System.out.println(
    
    );
    }
    boolean esAntiguo(){
        if ( anioFabricacion >= 10 ) {
            return true;
        } else {
            return false;
        }
        
        
      
        }

    void matricula(String asz) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void marca(String seat) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void precioDia(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void anioFabricacion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }



    
}
