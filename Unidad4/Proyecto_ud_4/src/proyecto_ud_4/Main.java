/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_ud_4;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("111", "El Quijote", "Cervantes", 1605, EstadoPrestamo.DISPONIBLE);
        Libro libro2 = new Libro("112", "Archipielago Gulag", "Aleksandr Solzhenitsyn", 1973, EstadoPrestamo.DISPONIBLE);
        Libro libro3 = new Libro("113", "El Principito", "Antoine de Saint-Exupery", 1943, EstadoPrestamo.DISPONIBLE);
        Usuario usuario1 = new Usuario("12345678A", "Ana", 25);
        Usuario usuario2 = new Usuario("12345678B", "Antonio", 18);
        Usuario usuario3 = new Usuario("12345678C", "Hugo", 8);

        System.out.println("=== Antes del prestamo ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();

        Prestamo prestamo1 = new Prestamo(libro1, usuario1, 10);
        Prestamo prestamo3 = new Prestamo(libro3, usuario3, 20);

        System.out.println("\n=== Despues del prestamo ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();

        prestamo3.marcarRetraso();
        prestamo1.marcarEntrega();

        System.out.println("\n=== Despues del retraso ===");
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();
          
    }
    
}
