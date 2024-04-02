package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// Se crea el objeto scanner que permite el ingreso de datos a través de la consola
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un número real: ");
		float x = scanner.nextFloat(); // Devuelve un valor de tipo float 
		
		scanner.close(); // Cierra el objeto scanner para 
		
		System.out.println("\nEl número ingresado es " + x);
	}
}