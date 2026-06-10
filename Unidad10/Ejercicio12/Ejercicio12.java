package ejercicio12;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Ejercicio12 {

	public static void main(String[] args) {

		try {

			// Abrimos la conexión con la base de datos, fran es el nombre de usuario de la base de datos y Fr4n la contraseña
			Connection con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/tienda?allowPublicKeyRetrieval=true&useSSL=false", "fran", "Fr4n");

			System.out.println("¡Conexión exitosa!");

			// Obtenemos los metadatos de la base de datos el objeto meta ahora sabe cosas como que tablas existe y columnas
			DatabaseMetaData meta = con.getMetaData();

			// Tablas de la base de datos

			System.out.println("\nTABLAS:");
			
			/*
			 * El programa le pide al objeto meta que busque todas las tablas de usuario de
			 * la base de datos
			 */
			
			/*
			 * Los dos primeros parámetros son null para indicarle que busque en el catálogo
			 * y esquema que vienen por defecto en la conexión
			 * 
			 * 
			 * % es como un comodin por lo que buscará tablas con cualquier nombre.
			 	El filtro new String[] {"TABLE"}
			 */
			
			ResultSet tablas = meta.getTables(null, null, "%", new String[] {"TABLE"});

			while (tablas.next()) {
				System.out.println(tablas.getString("TABLE_NAME"));
			}

			// Columnas de la tabla producto

			System.out.println("\nCOLUMNAS DE PRODUCTO:");
			
			// "producto": Le dice explícitamente que busque solo dentro de la tabla llamada "producto".

			// "%": Trae cualquier nombre de columna que exista dentro de ella.
			
			
			ResultSet columnas = meta.getColumns(null, null, "producto", "%");

			while (columnas.next()) {
				System.out.println(columnas.getString("COLUMN_NAME"));
			}

			// Información de la conexión

			System.out.println("\nUSUARIO:");
			System.out.println(meta.getUserName());

			System.out.println("\nURL:");
			System.out.println(meta.getURL());

			System.out.println("\nDRIVER:");
			System.out.println(meta.getDriverName());

			System.out.println("\nVERSIÓN DEL DRIVER:");
			System.out.println(meta.getDriverVersion());

			System.out.println("\nSGBD:");
			System.out.println(meta.getDatabaseProductName());

			System.out.println("\nVERSIÓN DEL SGBD:");
			System.out.println(meta.getDatabaseProductVersion());

			// Cerramos recursos
			tablas.close();
			columnas.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error al acceder a la base de datos");
		}
	}
}