package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un número entero: ");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		// Si el número se puede dividir entre 2, osea su residuo es 0, será par.
		if(numero % 2 == 0) {
			System.out.println("-> El número " + numero + " es par.");
			
		} else {
			System.out.println("\n-> El número " + numero + " es impar.");
		}
	}
}