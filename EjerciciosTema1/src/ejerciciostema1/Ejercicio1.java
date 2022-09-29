package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* Realizar un programa que pida como entrada un número con decimales y 
		 * lo muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round()) 
		*/
		
		// variables
		Scanner scan = new Scanner(System.in); // se inicia el escáner
		float numDecimal; // variable del número de entrada
		int numEntero; // variable del número entero final
		
		// pedir datos
		System.out.println("Introduce un número con decimales: "); // mensaje para el usuario
		numDecimal = scan.nextFloat(); // introduccion del número por teclado
		
		// redondear número
		numEntero = (int) (numDecimal + 0.5); // redondeo del número decimal a uno entero
		
		// mostrar número entero redondeado
		System.out.println("El número redondeado es: " + numEntero); // respuesta que se muestra al usuario
		
		// cierre escáner
		scan.close();
	}

}
