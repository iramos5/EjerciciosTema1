package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crea un programa que pida la base y la altura de un triángulo y muestre su área. (AT = base*altura/2)
		
		// variables
		Scanner scan = new Scanner(System.in); // se inicia el escáner
		float base, altura, area; // variables decimales
		
		// pedir datos
		System.out.println("Introduce la base del triángulo: "); // se pide la base al usuario
		base = scan.nextFloat(); // introduccion de la base
		
		System.out.println("Introduce la altura del triángulo: "); // se pide la altura al usuario
		altura = scan.nextFloat(); // introduccion de la altura
		
		// calcular area
		area = base*altura/2; // formula aplicada para calcular el area
		
		// solucion
		System.out.println("El área del triángulo es de: " + area); // respuesta que se muestra al usuario
		
		// cierre escáner
		scan.close();
	}

}
