package ejercicio_2_ciudad;

public class Ciudad {

    public static void main(String[] args) {

        // Crear personas
        Persona daniel = new Persona("Daniel");
        Persona manuel = new Persona("Manuel");
        Persona pepe = new Persona("Pepe");

        // Tambien se puede poner:
        Persona juan;
        juan = new  Persona();
        
        
        
        
        
        
        
        // Imprimir personas
        System.out.println(daniel);
        System.out.println(manuel);
        System.out.println(pepe);
    }

    // Clase Persona
    static class Persona {
        String nombre;

        // Constructor
        public Persona(String nombre) {
            this.nombre = nombre;
        }

        private Persona() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }


    }
}


