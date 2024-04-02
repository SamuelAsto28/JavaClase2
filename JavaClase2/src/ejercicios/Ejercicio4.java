package ejercicios;

import java.util.Scanner;

/**
 * @author Samuel
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Primer punto
		float x1 = 0f;
		float y1 = 0f;
		float z1 = 0f;
		
		// Segundo punto
		float x2 = 0f;
		float y2 = 0f;
		float z2 = 0f;
		
		float distancia2D = 0f;
		float distancia3D = 0f;
		
		// a) Cálculo de la distancia de los puntos A y B (2D)
		System.out.println("a) Se calculará la distancia entre dos puntos (A y B) en los ejes XY (2D).");
		System.out.println(" Punto A:");
		
		System.out.print("  Ingrese el valor x: ");
		x1 = scanner.nextFloat();
		
		System.out.print("  Ingrese el valor y: ");
		y1 = scanner.nextFloat();
		
		System.out.println(" Punto B:");
		
		System.out.print("  Ingrese el valor x: ");
		x2 = scanner.nextFloat();
		
		System.out.print("  Ingrese el valor y: ");
		y2 = scanner.nextFloat();
		
		distancia2D = (float)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("-> La distancia entre los puntos A (" + x1 + "," + y1 + ") y B(" + x2 + "," + y2 + ") es " + distancia2D + " u.");
		
		// b) Cálculo de la distancia de los puntos P y Q (3D)
		System.out.println("\nb) Se calculará la distancia entre dos puntos (P y Q) en los ejes XYZ (3D).");
		System.out.println(" Punto P:");
		
		System.out.print("  Ingrese el valor x: ");
		x1 = scanner.nextFloat();
		
		System.out.print("  Ingrese el valor y: ");
		y1 = scanner.nextFloat();
		
		System.out.print("  Ingrese el valor z: ");
		z1 = scanner.nextFloat();
		
		System.out.println(" Punto Q:");
		
		System.out.print("  Ingrese el valor x: ");
		x2 = scanner.nextFloat();
		
		System.out.print("  Ingrese el valor y: ");
		y2 = scanner.nextFloat();
		
		System.out.print("  Ingrese el valor z: ");
		z2 = scanner.nextFloat();
		
		distancia3D = (float)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
		
		System.out.println("-> La distancia entre los puntos P (" + x1 + "," + y1 + "," + z1 + ")"
			+ " y Q(" + x2 + "," + y2 + "," + z2 + ") es " + distancia3D + " u.");
		
		scanner.close();
	}
}