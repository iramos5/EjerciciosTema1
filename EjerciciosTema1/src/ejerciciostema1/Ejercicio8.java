package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/* Una empresa que gestiona un parque acuático te solicita una aplicación 
		 * que les ayude a calcular el importe que hay que cobrar en la taquilla 
		 * por la compra de una serie de entradas (cuyo número será introducido por el usuario). 
		 * Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€. 
		 * En el caso de que el importe total sea igual o superior a 100€, se aplicará automáticamente un bono descuento del 5%.
		 */
		
		// variables
		Scanner scan = new Scanner(System.in); // iniciar escáner
		int infantiles, adultos; // variables
		double entradas1, entradas2, total; // variables
		
		// introducir datos
		System.out.println("Introduce la cantidad de entradas infantiles: "); // pedir al usuario cantidad de entradas infantiles
		infantiles = scan.nextInt(); // guardar nº de entradas infantiles
		
		System.out.println("Introduce la cantidad de entradas de adultos: "); // pedir al usuario cantidad de entradas de adultos
		adultos = scan.nextInt(); // guardar nº de entradas de adultos
		
		// cálculos
		entradas1 = infantiles * 15.5; // calcular precio de todas las entradas infantiles
		entradas2 = adultos * 20; // calcular precio de todas las entradas de adulto
		total = entradas1 + entradas2; // suma del valor total de entradas infantiles y de adultos
		
		if (total >= 100) { // aplicación del descuento
			total = total - ((total+5)/100);
		}
		
		// solución
		System.out.println("El total a pagar es de: " + total + " €"); // resultado por pantalla
		
		// cierre escáner
		scan.close();

		

	}

}
