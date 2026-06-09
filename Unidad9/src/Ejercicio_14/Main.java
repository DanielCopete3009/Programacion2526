package Ejercicio_14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item("martillo", 2, 4.34));
        items.add(new Item("radial", 3, 20.99));
        items.add(new Item("pico", 7, 7.59));
        items.add(new Item("regla", 1, 20.79));
        items.add(new Item("cuba", 200, 700.99));

        try {

            FileOutputStream fichero = new FileOutputStream("mochila.bin");
            ObjectOutputStream out = new ObjectOutputStream(fichero);

            // Guardamos la lista completa
            out.writeObject(items);

            out.close();
            fichero.close();

            System.out.println("Mochila guardada correctamente");

        } catch (IOException e) {

            System.out.println("Error al guardar");
        }
    }
}