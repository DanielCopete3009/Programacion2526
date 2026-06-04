package Ejercicio_5;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Frame frame = new Frame("Ejercicio 5");

        // Etiqueta
        Label label = new Label("Texto de prueba", Label.CENTER);
        frame.add(label);

        // Barra de menú
        MenuBar menuBar = new MenuBar();

        // Menú Estilo
        Menu estilo = new Menu("Estilo");
        estilo.add(new MenuItem("Negrita"));
        estilo.add(new MenuItem("Normal"));

        // Menú Color
        Menu color = new Menu("Color");
        color.add(new MenuItem("Rojo"));
        color.add(new MenuItem("Azul"));
        color.add(new MenuItem("Negro"));

        // Añadir menús
        menuBar.add(estilo);
        menuBar.add(color);

        frame.setMenuBar(menuBar);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
