package Ejercicio_4;

import java.io.IOException;

public class Main {
	public static void main(String args[]) {
		
		byte b[]=  new byte[5];
		try {
			System.in.read(b);
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
	}
}
