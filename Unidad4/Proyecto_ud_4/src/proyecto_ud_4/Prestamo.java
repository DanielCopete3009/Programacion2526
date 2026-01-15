/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ud_4;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Prestamo {
    
    // Atributos
    Libro libro;
    Usuario usuario;
    int diasPrestamo;
    
    
    
    // Constructor
    public Prestamo(Libro libro, Usuario usuario, int diasPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.diasPrestamo = diasPrestamo;

        // Cambia automáticamente el estado del libro
        libro.cambiarEstado(EstadoPrestamo.PRESTADO);
    }
    
    
    // Métodos
    public void mostrarDetalle() {
        System.out.println("=== Detalle del prestamo ===");
        libro.mostrarInformacion();
        usuario.mostrarDatos();
        System.out.println("Dias de prestamo: " + diasPrestamo);
    }
    
    
    public void marcarRetraso() {
        libro.cambiarEstado(EstadoPrestamo.RETRASADO);
    }
    
    public void marcarEntrega() {
        libro.cambiarEstado(EstadoPrestamo.DISPONIBLE);
    }
}
