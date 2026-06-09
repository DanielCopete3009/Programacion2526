package Ejercicio_9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {

    public static void main(String[] args) {

        // Crear el objeto File
        File file = new File("notas.txt");

        // Verificar si el archivo existe
        if (file.exists()) {

            System.out.println("El archivo ya existe.");
            System.out.println("Nombre: " + file.getName());
            System.out.println("Ruta absoluta: " + file.getAbsolutePath());

        } else {

            try {

                // Crear el archivo automáticamente
                if (file.createNewFile()) {

                    System.out.println("Archivo creado correctamente.");
                    System.out.println("Nombre: " + file.getName());
                    System.out.println("Ruta absoluta: " + file.getAbsolutePath());
                    FileWriter fw = new FileWriter(file);
                    fw.write("holaa");
                    fw.close();

                } else {

                    System.out.println("No se pudo crear el archivo.");
                }

            } catch (IOException e) {

                // Manejo de excepciones
                System.err.println(e.getMessage());
            }
        }
    }
}