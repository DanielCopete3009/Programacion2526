package Ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo1 {

    public static void main(String[] args) {

        Frame ventana = new Frame("Hola mundo!");
        ventana.setLayout(new FlowLayout());
        ventana.setSize(300, 150);
        

       // boton
        Button miboton = new Button("click aqui");
        ventana.add(miboton);
       
        ActionListener escuchadorboton = new MiListener();
		miboton.addActionListener(escuchadorboton);
        
        
        ventana.setVisible(true);
    }
}

