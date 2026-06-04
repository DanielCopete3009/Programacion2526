package Ejercicio_3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Ejercicio_2.Artista;
import Ejercicio_2.GeneroMusical;

public class Main {

    public static void main(String[] args) {

        // Crear conexión con ObjectDB
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("objectdb:db/festival.odb");

        // Crear gestor
        EntityManager em = emf.createEntityManager();

        // Iniciar transacción
        em.getTransaction().begin();

        // Crear artistas
        Artista a1 = new Artista("Bad Bunny");
        Artista a2 = new Artista("Quevedo");

        // Guardar artistas
        em.persist(a1);
        em.persist(a2);

        // Crear festival
        Festival f1 = new Festival(
                "Mad Cool",
                "Madrid",
                50000,
                GeneroMusical.ROCK
        );

        // Añadir artistas
        f1.agregarArtista(a1);
        f1.agregarArtista(a2);

        // Guardar festival
        em.persist(f1);

        // Confirmar
        em.getTransaction().commit();

        // Cerrar conexión
        em.close();
        emf.close();

        System.out.println("Datos guardados correctamente");
    }
}