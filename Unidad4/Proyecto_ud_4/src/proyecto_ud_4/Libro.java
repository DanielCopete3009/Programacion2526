/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_ud_4;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Libro {
    
    // Atributos 
    String isbn;
    String titulo;
    String autor;
    int anioPublicacion;
    EstadoPrestamo estado;
    
    // Constructor
    public Libro(String isbn, String titulo, String autor, int anioPublicacion, EstadoPrestamo estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.estado = estado;
        
    }

     // Métodos
    public void mostrarInformacion() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anno de publicacion: " + anioPublicacion);
        System.out.println("Estado: " + estado);
    }

    
    public boolean esAntiguo() {
        return (2026 - anioPublicacion) > 20;
    }

    public void cambiarEstado(EstadoPrestamo nuevoEstado) {
        estado = nuevoEstado;
    }

}



