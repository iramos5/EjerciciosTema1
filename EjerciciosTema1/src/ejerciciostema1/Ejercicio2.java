package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Escribe un programa que tome como entrada un número entero e 
		 * indique qué cantidad hay que sumarle para que sea múltiplo de 7. 
		 * Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. 
		 * En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) para calcularlo. */

		// variables
		Scanner scan = new Scanner(System.in);
		int numEntero, cantidad, resto;
		
		// pedir datos
		System.out.println("Introduce un número entero: ");
		numEntero = scan.nextInt();
		
		// calcular la cantidad que hay que sumarle para que sea múltiplo de 7
		resto = numEntero%7;
		cantidad = 7 - resto;
		
		// mostrar solución
		System.out.println("Para que " + numEntero + " sea múltiplo de 7, hay que sumarle " + cantidad);
		
		// cierre escáner
		scan.close();
		
	}

}
