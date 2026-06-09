package FileInputStream;

import java.io.FileInputStream;

public class LeerArchivo {

    public static void main(String[] args) throws Exception { // indica que, si ocurre un error al leer el archivo, el programa puede lanzar una excepción.

        FileInputStream leerarchivo = new FileInputStream("prueba.txt");
        // Este objeto lee byte por byte
        System.out.print((char) leerarchivo.read());

        leerarchivo.close();
    }
}