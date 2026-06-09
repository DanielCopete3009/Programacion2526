package Ejercicio2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

public class Ejercicio2 {
    public static void main(String[] args) {

        Frame ventana = new Frame("Ejercicio 2");
        ventana.setSize(400, 300);
        ventana.setLayout(null);
        ventana.setVisible(true);

        Label etiqueta = new Label("Etiqueta");
        etiqueta.setBounds(50, 50, 100, 30);

        Button boton = new Button("Botón");
        boton.setBounds(50, 100, 100, 30);

        ventana.add(etiqueta);
        ventana.add(boton);
        
    }
}