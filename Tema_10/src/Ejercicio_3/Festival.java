package Ejercicio_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Ejercicio_2.Artista;
import Ejercicio_2.GeneroMusical;

@Entity
public class Festival implements Serializable {

    // ID automático
    private static long contadorId = 10;

    @Id
    private Long id;

    private String nombre;
    private String ciudad;
    private int aforoMaximo;

    private GeneroMusical genero;

    @OneToMany
    private List<Artista> artistasConfirmados;

    // NO persistente
    private transient int control;

    // Constructor vacío
    public Festival() {
        this.id = contadorId;
        contadorId += 10;

        this.artistasConfirmados = new ArrayList<>();
    }

    // Constructor completo
    public Festival(String nombre, String ciudad,
                     int aforoMaximo, GeneroMusical genero) {

        this.id = contadorId;
        contadorId += 10;

        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aforoMaximo = aforoMaximo;
        this.genero = genero;

        this.artistasConfirmados = new ArrayList<>();
    }

    // GETTERS Y SETTERS

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public List<Artista> getArtistasConfirmados() {
        return artistasConfirmados;
    }

    public void setArtistasConfirmados(List<Artista> artistasConfirmados) {
        this.artistasConfirmados = artistasConfirmados;
    }

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    // Método auxiliar
    public void agregarArtista(Artista artista) {
        artistasConfirmados.add(artista);
    }

    @Override
    public String toString() {
        return "Festival{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", aforoMaximo=" + aforoMaximo +
                ", genero=" + genero +
                ", artistasConfirmados=" + artistasConfirmados +
                '}';
    }
}