package boletin1.datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DatosMain {

	public static final String FICHERO = "src\\boletin1\\datos\\Datos.txt";

	public static void main(String[] args) {

		/*
		 * Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben
		 * guardarse en el fichero datos.txt. Si este fichero existe, deben añadirse al
		 * final en una nueva línea, y en caso de no existir, debe crearse.
		 */

		Scanner sc = new Scanner(System.in);

		String cad;
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO, true))) {
			
			System.out.println("Introduzca su nombre y edad");
			cad = sc.nextLine();
			
			// escribir la palabra introducida
			bw.write(cad);

			// pasar a la siguiente linea
			bw.newLine();
			
			// cerrar
			bw.close();

		} catch (IOException e) {

			System.out.println("El fichero " + e.getMessage() + " no existe");
			
		}
		
		sc.close();

	}

}
