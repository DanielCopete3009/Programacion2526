package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Elena");

        System.out.println("Lista de nombres:");
        mostrarNombres(nombres);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        nombres.add(nuevoNombre);

        System.out.println("Lista actualizada:");
        mostrarNombres(nombres);

        System.out.print("Introduce el nombre que deseas eliminar: ");
        String nombreEliminar = scanner.nextLine();

        if (nombres.contains(nombreEliminar)) {
            nombres.remove(nombreEliminar);
            System.out.println("Nombre eliminado correctamente.");
        } else {
            System.out.println("El nombre no se encuentra en la lista.");
        }

        System.out.println("Lista final:");
        mostrarNombres(nombres);

        System.out.println("Número total de nombres: " + nombres.size());

        scanner.close();
    }

    public static void mostrarNombres(List<String> nombres) {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}