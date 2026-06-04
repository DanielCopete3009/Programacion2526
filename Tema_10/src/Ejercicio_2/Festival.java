package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * POJO preparado para persistencia en BD
 */
public class Festival {

    // Identificador único
    private Long id;

    // Atributos
    private String nombre;
    private String ciudad;
    private int aforoMaximo;

    // Género musical
    private GeneroMusical genero;

    // Lista de artistas confirmados
    private List<Artista> artistasConfirmados;

    /**
     * Constructor vacío obligatorio para muchos frameworks de persistencia
     */
    public Festival() {
        this.artistasConfirmados = new ArrayList<>();
    }

    /**
     * Constructor con parámetros
     */
    public Festival(Long id, String nombre, String ciudad,
                     int aforoMaximo, GeneroMusical genero) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aforoMaximo = aforoMaximo;
        this.genero = genero;
        this.artistasConfirmados = new ArrayList<>();
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // Método auxiliar
    public void agregarArtista(Artista artista) {
        artistasConfirmados.add(artista);
    }

    // equals y hashCode (recomendables en entidades persistentes)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Festival)) return false;
        Festival festival = (Festival) o;
        return Objects.equals(id, festival.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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