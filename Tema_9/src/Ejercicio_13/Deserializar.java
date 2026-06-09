package Ejercicio_13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializar {

    public static void main(String[] args) {

        try {
            FileInputStream fichero = new FileInputStream("persona.dat");
            ObjectInputStream in = new ObjectInputStream(fichero);

            Persona p = (Persona) in.readObject();
            in.close();

            System.out.println("Persona leída:");
            System.out.println(p);

        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        }
    }
}
