package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/* Solicita al usuario tres distancias:
		La primera, medida en milímetros.
		La segunda, medida en centímetros.
		La última, medida en metros.
		Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
		*/
		
		// variables
		Scanner scan = new Scanner(System.in); // iniciar escáner
		float mm, cm, m, suma; // variables
		
		// introducir datos
		System.out.println("Introduce una cantidad de milímetros: "); // pedir al usuario los milímetros
		mm = scan.nextFloat(); // guardar milímetros
		
		System.out.println("Introduce una cantidad de centímetros: "); // pedir al usuario los centímetros
		cm = scan.nextFloat(); // guardar centímetros
		
		System.out.println("Introduce una cantidad de metros: "); // pedir al usuario los metros
		m = scan.nextFloat(); // guardar metros
		
		// cálculos
		mm = mm/10; // pasar los milímetros a centímetros
		m = m * 100; // pasar los metros a centímetros
		suma = mm + cm + m; // sumar todas las cantidades convertidas
		
		// solución
		System.out.println("La suma de las tres cantidades equivale a: " + suma + " centímetros"); // resultado por pantalla
			
		// cierre escáner
		scan.close();

	}

}
