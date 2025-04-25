package boletin1.cadena;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadenaMain {

	public static final String FICHERO = "src\\boletin1\\cadena\\Cadena.txt";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String cad;

		System.out.println("Introduzca una cadena de text:");
		cad = sc.nextLine();

		while (!cad.equalsIgnoreCase("fin")) {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO, true))) {

				// escribir la palabra introducida
				bw.write(cad);

				// pasar a la siguiente linea
				bw.newLine();
				
				// cerrar
				bw.close();
				
			} catch (IOException e) {
				System.out.println("Error: No se ha podido escribir en el fichero " + e.getMessage());
			}

		}
		
		sc.close();

	}

}
