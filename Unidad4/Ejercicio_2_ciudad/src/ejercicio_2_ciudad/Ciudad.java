package ejercicio_2_ciudad;

public class Ciudad {

    public static void main(String[] args) {

        // Crear personas
        Persona daniel = new Persona();
        Persona manuel = new Persona();
        Persona pepe = new Persona();

        // Otra forma de crear objeto
        Persona juan;
        juan = new Persona();

        // Asignar atributos
        juan.nombre = "Juanje";
        juan.edad = 20;
        juan.estatura = 180;

        daniel.nombre = "Dani";
        daniel.edad = 22;
        daniel.estatura = 175;

        manuel.nombre = "Manuelito";
        manuel.edad = 25;
        manuel.estatura = 170;

        pepe.nombre = "Pepe";
        pepe.edad = 30;
        pepe.estatura = 165;

        // Imprimir personas
        System.out.println(daniel);
        System.out.println(manuel);
        System.out.println(pepe);
        System.out.println(juan);

        System.out.println("Hola soy " + juan.nombre + " y tengo " + juan.edad + " años");
    }
}



