package Ejercicio_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce exactamente 4 caracteres:");
        String pedir = sc.nextLine();

        // Validación
        if (pedir.length() != 4) {
            System.out.println("Solo se permite introducir exactamente 4 caracteres.");
            sc.close();
            return;
        }

        // Guardamos cada carácter
        char c1 = pedir.charAt(0);
        char c2 = pedir.charAt(1);
        char c3 = pedir.charAt(2);
        char c4 = pedir.charAt(3);

        // 1. write
        System.out.write(c1);
        System.out.flush(); // necesario para write

        // 2. print
        System.out.print(c2);

        // 3. println
        System.out.println(c3);

        // 4. printf
        System.out.printf("%c", c4);

        sc.close();
    }
}
