package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 0; // N�mero de t�rminos
		int sumaTotal = 0; // Suma total de los t�rminos
		
		// a) Suma de los primeros 'n' n�meros naturales
		System.out.println("a) Suma de los primeros n�meros naturales");
		System.out.print(" Escriba el t�rmino n-esimo: ");
		
		n = scanner.nextInt();
		sumaTotal = n * (n + 1) / 2;
		
		System.out.println("-> La suma total es " + sumaTotal + ".\n");
		
		// b) Suma de cuadrados de los primeros 'n' n�meros naturales
		System.out.println("b) Suma de cuadrados de los primeros n�meros naturales");
		System.out.print(" Escriba el t�rmino n-esimo: ");
		
		n = scanner.nextInt();
		sumaTotal = n * (n + 1) * (2 * n + 1)/ 6;
		
		System.out.println("-> La suma total es " + sumaTotal + ".\n");
		
		// c) Suma de cubos de los primeros 'n' n�meros naturales
		System.out.println("c) Suma de cubos de los primeros n�meros naturales");
		System.out.print(" Escriba el t�rmino n-esimo: ");
		
		n = scanner.nextInt();
		sumaTotal = (int)Math.pow(n * (n + 1), 2) / 4;
		
		System.out.println("-> La suma total es " + sumaTotal + ".");
		
		scanner.close();
	}
}