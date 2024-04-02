package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Permite el ingreso de datos a través de la consola
		
		System.out.print("Ingrese un número real (x): ");
		float x = scanner.nextFloat(); // Devuelve un valor de tipo float 
		
		scanner.close(); // Cierra el ingreso de datos mediante la consola 
		
		float numerador = (float)(2 * Math.pow(x, -3) + 5 * Math.pow(x, 2) - 8 * x);
		float denominador = (float)Math.sqrt(9 * Math.pow(x, 3) - 2 * Math.pow(x, 2) + x);
		
		float resultado = numerador / denominador;
		
		System.out.print("El resultado es " + resultado);
		
		if(resultado > - 1 && resultado < 1) {
			System.out.println(" y pertenece al rango <-1, 1>.");
			
		} else {
			System.out.println(" y no pertenece al rango <-1, 1>.");
		}
	}
}