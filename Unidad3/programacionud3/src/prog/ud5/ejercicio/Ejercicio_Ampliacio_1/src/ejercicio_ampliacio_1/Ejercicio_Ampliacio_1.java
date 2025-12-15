package ejercicio_ampliacio_1;

import java.util.Random;

public class Ejercicio_Ampliacio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombre = {"Daniel Copete", "Raulito de prado", "Raulito de miallami", "carrero", "carreras", "alejandrito", "antonio", "adrian", "atalai", "pizza", "oscar", "jhonal", "jocemari"};
        Random generador = new Random();
        int totalNombres = nombre.length; 
        int indiceAleatorio = generador.nextInt(totalNombres);
        String nombreAleatorio = nombre[indiceAleatorio];
        System.out.println("El índice aleatorio fue: " + indiceAleatorio);
        System.out.println("El nombre escogido al azar es: " + nombreAleatorio);
    }
}