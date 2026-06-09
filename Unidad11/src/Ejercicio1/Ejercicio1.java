package Ejercicio1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {

	public static void main(String[] args) {
		Frame frame = new Frame ("Hola mundo!");
		
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setLayout(null);
		frame.setSize(300,300);
		frame.setVisible(true);

		Button salir = new Button("Salir");
		salir.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			((Frame)salir.getParent()).dispose();
		}
		});
		
		Button limpiar = new Button("Limpiar");
		limpiar.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			((Frame)limpiar.getParent()).dispose();
		}
		});
		
		TextField escribir = new TextField("Escribe algo...");
		escribir.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			((Frame)escribir.getParent()).dispose();
		}
		});
		
		salir.setBounds(30, 50, 70, 30);
		limpiar.setBounds(100, 50, 70, 30);
		escribir.setBounds(30, 90, 140, 30);
	
		frame.add(salir);
		frame.add(limpiar);
		frame.add(escribir);
	}

}
