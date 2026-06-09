package Ejercicio_10;

import java.io.*;

public class main {

    public static void main(String[] args) {

        File directorio = new File("C:\\Users\\06_1DAW_Alum\\Desktop\\Tema_9");
        File fichero = new File(directorio, "ejercicio10.txt");

        try {

            // 1. Comprobar si existe el fichero
            if (fichero.exists()) {
                System.out.println("El fichero existe.");

                // 2. Escribir en el fichero
                FileWriter fw = new FileWriter(fichero, true); // true = añadir contenido
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Hola, esto es una línea escrita en el fichero.");
                bw.newLine();
                bw.write("Segunda línea de prueba.");

                bw.close();

                System.out.println("Contenido escrito correctamente.");

            } else {
                System.out.println("El fichero no existe, se va a crear.");

                fichero.createNewFile();

                FileWriter fw = new FileWriter(fichero);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("Fichero creado desde cero.");
                bw.newLine();
                bw.write("Primera escritura.");

                bw.close();

                System.out.println("Fichero creado y escrito.");
            }

            // 3. Mostrar contenido por consola
            System.out.println("\n--- Contenido del fichero ---");

            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}          
           


        
    
