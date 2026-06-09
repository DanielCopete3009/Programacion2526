package Ejercicio_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuarioCorrecto = "Dani";
        String contraseñaCorrecta = "dani";

        boolean accesoCorrecto = false;

        for (int i = 0; i < 3 && accesoCorrecto == false; i++) {

            System.out.println("Introduce usuario:");
            String usuario = sc.nextLine();

            System.out.println("Introduce contraseña:");
            String contraseña = sc.nextLine();

            if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
                System.out.println("Acceso correcto. Bienvenido.");
                accesoCorrecto = true;
            } else {
                System.out.println("Credenciales incorrectas.");
            }
        }

        if (accesoCorrecto == false) {
            System.out.println("Has agotado los intentos. Acceso bloqueado.");
        }

        sc.close();
    }
}
