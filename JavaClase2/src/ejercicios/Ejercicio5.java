package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float anguloRad = 0f; // Ángulo en radianes
		float anguloDeg = 0f; // Ángulo en grados
		
		float grados = 0f;
		float minutos = 0f;
		float segundos = 0f;
		
		System.out.print("Introduzca un ángulo en radianes (rad): ");
		anguloRad = scanner.nextFloat();
		
		anguloDeg = (float)(180 * anguloRad / Math.PI);
		System.out.println("\n Angulo en grados: " + anguloDeg + "°\n");
		
		grados = (float)Math.floor(anguloDeg);
		System.out.println(" grados: " + grados + "°");
		
		float minutosTemp = (anguloDeg - grados) * 60;
		minutos = (float)Math.floor(minutosTemp);
		System.out.println(" minutos: " + minutos + "'");
		
		segundos = (minutosTemp - minutos) * 60;
		System.out.println(" segundos: " + segundos + "''");
		
		scanner.close();
	}
}