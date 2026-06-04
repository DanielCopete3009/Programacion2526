package Ejercicio_2;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artista implements Serializable {

    private static long contador = 1;

    @Id
    private Long id;

    private String nombre;

    public Artista() {
        this.id = contador++;
    }

    public Artista(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
