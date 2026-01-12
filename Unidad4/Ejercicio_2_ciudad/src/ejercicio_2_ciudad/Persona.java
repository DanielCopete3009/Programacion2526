package ejercicio_2_ciudad;

public class Persona {

    String nombre;
    int edad;
    double estatura;

    void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    void cumplir() {
        edad = edad + 1;
    }

    void crecer(double incremento) {
        estatura = estatura + incremento;
    }

  
}
