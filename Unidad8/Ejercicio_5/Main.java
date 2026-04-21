package Ejercicio_5;
import java.util.*;
public class Main {
	public static void main(String[] args) {

        // 1. Crear conjunto vacío (interfaz + genéricos + envoltorio)
        Set<Integer> conjunto = new HashSet<>();

        // 2. Agregar los primeros 5 números naturales
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);
        conjunto.add(4);
        conjunto.add(5);

        // 3. Imprimir el conjunto
        System.out.println(conjunto);
        // Imprime el VALOR, no la referencia

        // 4. Añadir número repetido
        conjunto.add(3);
        System.out.println(conjunto);
        // NO se añade, los Sets no permiten duplicados

        // 5. Añadir null
        conjunto.add(null);
        System.out.println(conjunto);
        // HashSet SÍ permite un null

        // 6. Crear nuevo conjunto con números primos
        Set<Integer> primos = new HashSet<>();
        primos.add(2);
        primos.add(3);

        // Comprobar si es subconjunto
        boolean esSubconjunto = conjunto.containsAll(primos);
        System.out.println(esSubconjunto);
        // true si todos los elementos están en el conjunto original

        // 7. Lista final
        final List<Integer> lista = new ArrayList<>(conjunto);

        // ¿Podemos modificarla?
        lista.add(100);   //  SÍ
        lista.remove(1);  //  SÍ
        lista.set(0, 999); // SÍ
// control + shift + c se comenta la linea
        
        System.out.println(lista);

        //  Pero esto NO se puede:
        // lista = new ArrayList<>(); (error)
    }
}