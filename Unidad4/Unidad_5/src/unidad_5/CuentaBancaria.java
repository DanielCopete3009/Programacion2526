/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad_5;

/**
 *
 * @author 06_1DAW_Alum
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;
    
    
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    
    }
    
 public String getTitular(){
    return titular;
 }
public double getSaldo(){
    return saldo;
}

public void ingresar (double cantidad){
    if(cantidad >= 0)
        this.saldo = this.saldo + cantidad;
}

public void retirar (double cantidad){
    if (cantidad <= 0)
        saldo = saldo - cantidad;
}





public void setTitular(String titular){
    this.titular = titular;
}







}
