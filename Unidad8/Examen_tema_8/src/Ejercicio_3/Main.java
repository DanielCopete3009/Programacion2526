package Ejercicio_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> diccionario = new HashMap<>();
		
		diccionario.put("Hola", 1);
		diccionario.put("Planta", 1);
		diccionario.put("Nadar", 3);
		diccionario.put("Nadar", 2);// Al insertar una clave igual a  la anterior esta aplastaria esta ultima 
		//, es decir que si inserto dos claves iguales el valo insertado despúes se guardara con esa clave
		
		System.out.println(diccionario);
	}
	
	Iterator <Map.Entry<String, Integer>> it =  Entry.diccionario.iterator();
	
	while(it.hasnext) {
		System.out.println(it.next());
	}
}
