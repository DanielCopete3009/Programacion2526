package Ejercicio_11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		
		try {
            RandomAccessFile archivo = new RandomAccessFile("record.txt", "rw");
            archivo.writeBytes("Nivel:001");
            archivo.seek(6);
            
            Scanner sc = new Scanner(System.in);
            System.out.print("¿Qué nivel quieres ponerte? ");
            String nuevoNivel = sc.nextLine();
         
            
		}catch(IOException e){
            System.err.println(e.getMessage());
		}
	}
}
