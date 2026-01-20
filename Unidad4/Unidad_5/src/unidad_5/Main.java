/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad_5;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Main {


    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("David", 2000);
        cuenta1.setTitular("David real");
        cuenta1.ingresar(1000);
        cuenta1.retirar(20);
        System.out.println("Sado total;" + cuenta1.getSaldo());
        
    }
    
}
