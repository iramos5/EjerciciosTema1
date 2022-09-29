package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Crea un programa que pida la base y la altura de un triángulo y muestre su área. (AT = base*altura/2)
		
		// variables
		Scanner scan = new Scanner(System.in);
		float base, altura, area;
		
		// pedir datos
		System.out.println("Introduce la base del triángulo: ");
		base = scan.nextFloat();
		
		System.out.println("Introduce la altura del triángulo: ");
		altura = scan.nextFloat();
		
		// calcular area
		area = base*altura/2;
		
		// solucion
		System.out.println("El área del triángulo es de: " + area);
		
		// cierre escáner
		scan.close();
	}

}
