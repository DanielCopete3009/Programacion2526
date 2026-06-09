package Ejercicio_15;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

    public static void main(String[] args) {

        try {

            // Ruta del archivo XML
            File archivo = new File("config.xml");

            // Comprobar ruta y existencia
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("¿Existe el archivo?: " + archivo.exists());

            // Crear parser XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Leer XML
            Document documento = builder.parse(archivo);

            // Normalizar
            documento.getDocumentElement().normalize();

            // Obtener raíz
            Element raiz = documento.getDocumentElement();

            System.out.println("Elemento raíz: " + raiz.getNodeName());

            // Obtener base-datos
            NodeList lista = raiz.getElementsByTagName("base-datos");

            Node nodo = lista.item(0);

            // Convertir a Element
            Element baseDatos = (Element) nodo;

            // Obtener atributo
            String motor = baseDatos.getAttribute("motor");

            System.out.println("Motor: " + motor);

            // Obtener hijos
            NodeList hijos = baseDatos.getChildNodes();

            System.out.println("\nElementos del XML:");

            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                // Solo elementos reales
                if (hijo.getNodeType() == Node.ELEMENT_NODE) {

                    Element elemento = (Element) hijo;

                    System.out.println(
                            elemento.getTagName() + ": "
                                    + elemento.getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
