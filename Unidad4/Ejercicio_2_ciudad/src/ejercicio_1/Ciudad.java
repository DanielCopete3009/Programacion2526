package ejercicio_1;


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
        
        //Parte 4 constructores
        
        Persona a = new Persona("curro", 20 , 1.60); //Creamos el objeto e lo inicializamos con el constructor
        Persona b = new Persona("antonio", 24 , 1.88); // Con parámetros
        
        Persona paco = new Persona();//Creando dos personas mas 
        Persona pepee = new Persona();
        
        Persona c = new Persona("Alejandro","oñate", 24 , 1.8f);
        
        Persona juanje = new Persona("Juan", "Perez", 20, 180f,Persona.Sexo.MASCULINO);
                
         System.out.println(juan.nombre);
         System.out.println(juan.apellido);
         System.out.println(juan.edad);
         System.out.println(juan.estatura);
         System.out.println(juan.sexo);
        
        
        

        // Imprimir personas
        System.out.println(daniel);
        System.out.println(manuel);
        System.out.println(pepe);
        System.out.println(juan);

        System.out.println("Hola soy " + juan.nombre + " y tengo " + juan.edad + " años");
    }
}



