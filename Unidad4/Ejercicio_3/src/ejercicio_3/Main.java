/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Main {

   
    public static void main(String[] args) {
       // Creación de objetos Vehiculo
        Vehiculo v1 = new Vehiculo("1234ABC", "Toyota", 2015, 15000, TipoVehiculo.TURISMO);
        Vehiculo v2 = new Vehiculo("5678DEF", "Yamaha", 2018, 8000, TipoVehiculo.MOTOCICLETA);
        Vehiculo v3 = new Vehiculo("9012GHI", "Volvo", 2008, 30000, TipoVehiculo.CAMION);
            
        
        // Mostrar información antes del descuento
        System.out.println("INFORMACIÓN INICIAL");
        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();

        // Demostración de referencias
        Vehiculo referencia = v1;
        referencia.aplicarDescuento(10);

        // Aplicar descuentos
        v2.aplicarDescuento(5);
        v3.aplicarDescuento(15);

        // Mostrar información después del descuento
        System.out.println("INFORMACIÓN DESPUÉS DEL DESCUENTO");
        v1.mostrarInformacion(); // Se ve afectado por la referencia
        v2.mostrarInformacion();
        v3.mostrarInformacion();

        // Comprobar si son antiguos
        System.out.println("¿El vehículo 1 es antiguo? " + v1.esAntiguo());
        System.out.println("¿El vehículo 3 es antiguo? " + v3.esAntiguo());
    }
    
}
