package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float radio = 0f;
		float area = 0f;
		
		System.out.print("Ingrese el valor del radio de un c�rculo: ");
		radio = scanner.nextFloat();
		
		scanner.close();
		
		area = (float)(Math.PI * Math.pow(radio, 2));
		System.out.println("\n El �rea del c�rculo es " + area + " u^2.");
	}
}