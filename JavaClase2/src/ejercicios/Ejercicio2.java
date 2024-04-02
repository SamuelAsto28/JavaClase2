package ejercicios;

/**
 * @author Samuel
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		float radio1 = 4f; // Datos del primer cilindro
		float altura1 = 2.5f;
		
		float areaTotal1 = (float)(2 * Math.PI * radio1 * (altura1 + radio1));
		
		
		float radio2 = 2f; // Datos del segundo cilindro
		float altura2 = 5f;
		
		float areaTotal2 = (float)(2 * Math.PI * radio2 * (altura2 + radio2));
		
		System.out.println("Datos 1er. cilindro: \n radio: " + radio1 + " m\n altura: " + altura1 + " m");
		System.out.println("El área total del primer cilindro es " + areaTotal1 + " m^2.\n");
		
		System.out.println("Datos 2do. cilindro: \n radio: " + radio2 + " m\n altura: " + altura2 + " m");
		System.out.println("El área total del segundo cilindro es " + areaTotal2 + " m^2.");
	}
}