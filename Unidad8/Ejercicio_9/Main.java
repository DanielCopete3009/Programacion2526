package Ejercicio_9;

import java.util.SortedSet;
import java.util.TreeSet;

import Ejercicio_2.Persona;

public class Main {

    public static void main(String[] args) {

        SortedSet<Persona> personas = new TreeSet<>();
        // SortedSet no admite duplicados, TreeSet ordena en orden natural

        Persona pino = new Persona("pino");
        personas.add(pino);

        Persona raul = new Persona("raul");
        personas.add(raul);

        Persona dacare = new Persona("dacare");
        personas.add(dacare);

        Persona pino2 = new Persona("pino");
        personas.add(pino2);

        System.out.println(personas);

    }
}
