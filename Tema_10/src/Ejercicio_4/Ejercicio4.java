package Ejercicio_4;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejercicio4 {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("eventos.odb");

        EntityManager em = emf.createEntityManager();

        Evento evento1 = new Evento();
        evento1.setNombre("Concierto Rock");
        evento1.setLugar("Madrid");

        Evento evento2 = new Evento();
        evento2.setNombre("Feria Tecnología");
        evento2.setLugar("Barcelona");

        em.getTransaction().begin();

        em.persist(evento1);
        em.persist(evento2);

        em.getTransaction().commit();

        em.close();
        emf.close();

        System.out.println("Eventos insertados correctamente");
    }
}