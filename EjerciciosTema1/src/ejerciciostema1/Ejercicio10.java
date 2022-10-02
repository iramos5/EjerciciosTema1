package ejerciciostema1;
import java.util.Scanner;


public class Ejercicio10 {

	public static void main(String[] args) {
		/* La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición 
		 * donde cada participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. 
		 * La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee), 
		 * pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales). 
		 * Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm.
		 * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre 
		 * la parte entera correspondiente en centímetros. Utiliza la conversión de tipos.
		 */
		
		// variables
		Scanner scan = new Scanner(System.in); // iniciar escáner
		double longitud, cm; // longitud en metros con decimales
		int ranking; // longitud en centímetros solo parte entera
		
		// introducir datos
		System.out.println("Introduce la longitud en metros con decimales: "); // pedir al usuario la longitud en metros con decimales
		longitud = scan.nextDouble(); // guardar la longitud en metros con decimales
		
		// cálculos
		cm = longitud * 100; //longitud en centímetros pero con decimales
		ranking = (int) cm; // conversión de tipo del decimal al entero
		
		// solución
		System.out.println("La longitud del lanzamiento es de: " + ranking + " cm"); // mostrar respuesta por pantalla
		
		// cierre escáner
		scan.close();

	}

}
