package ejercicio11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio11 {

    public static void main(String[] args) {

        try {

        	Connection con = DriverManager.getConnection(
        	        "jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false", "fran", "Fr4n");
        	
        	
			/*
			 * Lo necesitas obligatoriamente para poder escribir tus consultas SQL en
			 * formato de texto (Java) y enviarlas a MariaDB para que se ejecuten.
			 */
        	Statement stmt = con.createStatement();

        	
        	//Mostrar los productos españoles usando execute()
        	
        	
        	
			/*
			 * execute() es genérico y sirve para cualquier comando SQL (SELECT, INSERT,
			 * UPDATE, DELETE). Devuelve un valor booleano (true o false):
			 */
        
        	boolean resultado = stmt.execute(
        	        "SELECT * FROM producto WHERE pais='Espana'"
        	);
        	
        	//Si devuelve true significa que hay un ResultSet
        	if(resultado) {
        		
        		// Recuperamos los resultados de la consulta
        		
        		
        		
				/*
				 * Como usamos el método genérico execute, los datos se quedaron guardados
				 * momentáneamente dentro de stmt
				 */
        		
        	    ResultSet rs = stmt.getResultSet();
        	    
        	 // Recorremos todos los registros obtenidos
        	  
        	    
				/*
				 * Un bucle que va saltando fila por fila a través de los productos encontrados
				 * que sean de "Espana"
				 */
        	    
        	    while(rs.next()) {

        	        System.out.println(
        	        		rs.getInt("id") + " - " +
        					rs.getString("nombre") + " - " +
        					rs.getString("pais")
        	        );
        	    }

        	    rs.close();
        	}
        	
        	// Ejecutar un lote (batch) de consultas
        	
        	//Añadimos las consultas al lote
        	
			/*
			 * Este método no ejecuta nada aún. Lo que hace es acumular la sentencia SQL
			 * dentro de una lista de espera interna en el objeto stmt
			 */
        	
        	stmt.addBatch(
        	        "INSERT INTO producto VALUES " +
        	        "(4,'kiwi','Zaspri gold',120,'Nueva Zelanda')"
        	);

        	stmt.addBatch(
        	        "INSERT INTO producto VALUES " +
        	        "(5,'perito','Peritos de Tavizna',18,'Espana')"
        	);

        	stmt.addBatch(
        	        "INSERT INTO producto VALUES " +
        	        "(6,'platano','Platano canario',40,'Espana')"
        	);
        	
        	//Ejecutamos el lote 
        	stmt.executeBatch();
        	
        	System.out.println("Batch ejecutado correctamente");

        	stmt.close();
        	con.close();

        } catch (SQLException e) {

            System.out.println("Error al acceder a la base de datos");
        }
    }
}