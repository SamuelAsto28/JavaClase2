package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 0; // Número de términos
		int sumaTotal = 0; // Suma total de los términos
		
		// a) Suma de los primeros 'n' números naturales
		System.out.println("a) Suma de los primeros números naturales");
		System.out.print(" Escriba el término n-esimo: ");
		
		n = scanner.nextInt();
		sumaTotal = n * (n + 1) / 2;
		
		System.out.println("-> La suma total es " + sumaTotal + ".\n");
		
		// b) Suma de cuadrados de los primeros 'n' números naturales
		System.out.println("b) Suma de cuadrados de los primeros números naturales");
		System.out.print(" Escriba el término n-esimo: ");
		
		n = scanner.nextInt();
		sumaTotal = n * (n + 1) * (2 * n + 1)/ 6;
		
		System.out.println("-> La suma total es " + sumaTotal + ".\n");
		
		// c) Suma de cubos de los primeros 'n' números naturales
		System.out.println("c) Suma de cubos de los primeros números naturales");
		System.out.print(" Escriba el término n-esimo: ");
		
		n = scanner.nextInt();
		sumaTotal = (int)Math.pow(n * (n + 1), 2) / 4;
		
		System.out.println("-> La suma total es " + sumaTotal + ".");
		
		scanner.close();
	}
}