package Ejercicio_4;

import java.util.ArrayList;

public class NotasEjemplo {
    public static void main(String[] args) {

        // Array de entrada (Strings)
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // 1. Crear ArrayList de tipo Double
        ArrayList<Double> notas = new ArrayList<>();

        // 2. Conversión (Parsing) y añadido a la lista
        for (int i = 0; i < notasEntrada.length; i++) {
            Double nota = Double.valueOf(notasEntrada[i]); // también valdría parseDouble
            notas.add(nota);
        }

        // Mostrar lista
        System.out.println("Notas: " + notas);

        // 3. Cálculo de la media (Unboxing automático)
        double suma = 0.0;

        for (Double nota : notas) {
            suma += nota; // aquí Java hace unboxing automático
        }

        double media = suma / notas.size();
        System.out.println("Nota media: " + media);

        // 4. Filtrado: aprobados (>= 5.0)
        ArrayList<Double> aprobados = new ArrayList<>();

        for (Double nota : notas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        // Mostrar aprobados
        System.out.println("Aprobados: " + aprobados);
    }
}