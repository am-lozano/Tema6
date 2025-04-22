package boletin1.enteros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EnterosMain {

	public static void main(String[] args) {

		/*
		 * Implementar un programa que acceda a Enteros.txt con un objeto Scanner a
		 * través de un flujo de entrada, lea los números y calcule la suma y la media
		 * aritmética, mostrando los resultados por pantalla.
		 */

		int num;
		int suma = 0;
		int cont = 0;
		double media;

		try (Scanner sc = new Scanner(new FileReader("src\\boletin1\\enteros\\Enteros.txt"))) {

			while (sc.hasNextDouble()) {

				num = sc.nextInt();
				suma += num;
				cont++;

			}
			
			media = (double) suma / cont;

			System.out.println("Suma: " + suma);
			System.out.println("Media: " + media);

		} catch (FileNotFoundException e) {

			System.out.println("No se ha encontrado el fichero: " + e.getMessage());

		}

	}

}
