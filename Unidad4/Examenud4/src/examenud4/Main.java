/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud4;



/**
 *
 * @author 06_1DAW_Alum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Vehiculo p1 = new Vehiculo();//Constructor por defecto
      
      Vehiculo p2 = new Vehiculo();
      p2.matricula("asz");  
      p2.marca("seat");
      p2.precioDia(2333);
      p2.TipoVehiculo.COCHE;
      p2.anioFabricacion(2333);
      
        
      Vehiculo p3 = new Vehiculo();
      p3.matricula("ajz");  
      p3.marca("ebro");
      p3.precioDia(3333);
      p3.TipoVehiculo.COCHE;
      p3.anioFabricacion(2333);
      
      
      System.out.println("matricula" + p1.matricula , "marca + "p1.marca, "año de fabricacion"+ p1.anioFabricacion,"precio" + p1.precioDia,"tipo" + p1.tipo.MOTO);
      System.out.println(p1.esAntiguo());
      System.out.println("matricula" + p1.matricula , "marca + "p1.marca, "año de fabricacion"+ p1.anioFabricacion,"precio" + p1.precioDia,"tipo" + p1.tipo.MOTO);
      System.out.println(p2.esAntiguo());
      System.out.println("matricula" + p1.matricula , "marca + "p1.marca, "año de fabricacion"+ p1.anioFabricacion,"precio" + p1.precioDia,"tipo" + p1.tipo.MOTO);
      System.out.println(p3.esAntiguo());
    }

    
    
}
