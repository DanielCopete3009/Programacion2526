package Ejercicio_2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

public class Main {

    public static void main(String[] args) {

        Frame frame = new Frame("Ejemplo posicionamiento absoluto");
        frame.setLayout(null);
        frame.setSize(300, 200);

        Label etiqueta = new Label("Etiqueta personalizada");
        etiqueta.setBounds(50, 50, 150, 30);
        frame.add(etiqueta);

        Button boton = new Button("Aceptar");
        boton.setBounds(100, 100, 80, 30);
        frame.add(boton);

        frame.setVisible(true);
    }
}