package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese una cantidad de dinero en soles: ");
		float dinero = scanner.nextFloat(); // Almacena el dinero inicial
		float resto = dinero; // Almacenará el dinero restante
		
		scanner.close();
		
		// Dividimos el número de soles en billetes, monedas y centavos
		int billetes200 = (int)Math.floor(dinero / 200);
		resto -= billetes200 * 200;
		
		int billetes100 = (int)Math.floor(resto / 100);
		resto -= billetes100 * 100;
		
		int billetes50 = (int)Math.floor(resto / 50);
		resto -= billetes50 * 50;
		
		int billetes20 = (int)Math.floor(resto / 20);
		resto -= billetes20 * 20;
		
		int billetes10 = (int)Math.floor(resto / 10);
		resto -= billetes10 * 10;
		
		int monedas5 = (int)Math.floor(resto / 5);
		resto -= monedas5 * 5;
		
		int monedas2 = (int)Math.floor(resto / 2);
		resto -= monedas2 * 2;
		
		int monedas1 = (int)Math.floor(resto);
		resto -= monedas1;
		resto = Float.parseFloat(String.format("%.2f", resto)) * 100; // Nos quedamos solo con 2 decimales
		
		int centavos50 = (int)Math.floor(resto / 50);
		resto -= centavos50 * 50;
		
		int centavos20 = (int)Math.floor(resto / 20);
		resto -= centavos20 * 20;
		
		int centavos10 = (int)Math.floor(resto / 10);
		
		System.out.println("\n Billetes de 200: " + billetes200);
		System.out.println(" Billetes de 100: " + billetes100);
		System.out.println(" Billetes de 50: " + billetes50);
		System.out.println(" Billetes de 20: " + billetes20);
		System.out.println(" Billetes de 10: " + billetes10);
		System.out.println(" Monedas de 5: " + monedas5);
		System.out.println(" Monedas de 2: " + monedas2);
		System.out.println(" Monedas de 1: " + monedas1);
		System.out.println(" Centavos de 50: " + centavos50);
		System.out.println(" Centavos de 20: " + centavos20);
		System.out.println(" Centavos de 10: " + centavos10);
	}
}