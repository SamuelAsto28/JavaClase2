package ejercicios;

import java.util.Random;

/**
 * @author Samuel
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		Random random = new Random(); // Objeto que permite obtener números pseudo-aleatorios
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		
		float promedio = 0f;
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		
		/*
		 * Almacenamos 4 números aleatorios entre 0 y 100 mientras
		 * se busca almacenar el máximo y mínimo de estos.
		 */
		a1 = random.nextInt(100 +1); // a1 = (int)(Math.random() * (100 +1));
		if(a1 > maximo) maximo = a1;
		if(a1 < minimo) minimo = a1;
		
		a2 = random.nextInt(100 +1);
		if(a2 > maximo) maximo = a2;
		if(a2 < minimo) minimo = a2;
		
		a3 = random.nextInt(100 +1);
		if(a3 > maximo) maximo = a3;
		if(a3 < minimo) minimo = a3;
		
		a4 = random.nextInt(100 +1);
		if(a4 > maximo) maximo = a4;
		if(a4 < minimo) minimo = a4;
		
		System.out.println("Números aleatorios generados: " + a1 + ", " + a2 + ", " + a3 + ", " + a4 + "\n");
		
		promedio = (a1 + a2 + a3 + a4) / 4f;
		System.out.println(" Promedio: " + promedio);
		
		System.out.println(" Mínimo: " + minimo);
		System.out.println(" Máximo: " + maximo);
	}
}