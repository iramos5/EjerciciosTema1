package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Realizar un programa que pida como entrada un número con decimales y 
		 * lo muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round()) */
		
		// variables
		Scanner scan = new Scanner(System.in);
		float numDecimal;
		int numEntero;
		
		// pedir datos
		System.out.println("Introduce un número con decimales: ");
		numDecimal = scan.nextFloat();
		
		// redondear número
		numEntero = (int) (numDecimal + 0.5);
		
		// mostrar número entero redondeado
		System.out.println("El número redondeado es: " + numEntero);
		
	}

}
