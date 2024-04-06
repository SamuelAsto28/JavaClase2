package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float radio = 0f;
		float volumen = 0f;
		
		System.out.print("Ingrese el valor del radio de un círculo: ");
		radio = scanner.nextFloat();
		
		scanner.close();
		
		volumen = (float)((4f / 3) * Math.PI * Math.pow(radio, 3));
		System.out.println("\n El volumen del círculo es " + volumen + " u^3.");
	}
}