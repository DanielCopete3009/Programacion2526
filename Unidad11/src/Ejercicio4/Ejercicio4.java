package Ejercicio4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio4 {
    public static void main(String[] args) {
    	
        Frame ventana = new Frame("Panel del Ascensor");
        ventana.setSize(300, 400);
        ventana.setVisible(true);

        // Aplicamos un Layout de cuadrícula: 2 filas y 2 columnas
        ventana.setLayout(new GridLayout(2, 2));

        // Creamos los botones para los 4 pisos
        Button boton1 = new Button("Piso 1");
        Button boton2 = new Button("Piso 2");
        Button boton3 = new Button("Piso 3");
        Button boton4 = new Button("Piso 4");

        // Añado los botones a la ventana
        // El orden en que se añade es de izquierda a derecha, de arriba a abajo
        ventana.add(boton3);
        ventana.add(boton4);
        ventana.add(boton1);
        ventana.add(boton2);

    }
}