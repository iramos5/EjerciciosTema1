package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/* Dado el siguiente polinomio de segundo grado:
			y=ax2+bx+c
			Crea un programa que pida los coeficientes a, b y c, 
			así como el valor de x, y calcula el valor correspondiente de y. 
		*/
		
		// variables
		Scanner scan = new Scanner(System.in); // iniciar escáner
		int a, b, c, x, y; // variables que se piden
		
		// pedir datos al usuario
		System.out.println("Introduce a: "); // pedir al usuario a
		a = scan.nextInt(); // guardar a
		
		System.out.println("Introduce b: "); // pedir al usuario b
		b = scan.nextInt(); // guardar b
		
		System.out.println("Introduce c: "); // pedir al usuario c
		c = scan.nextInt(); // guardar c
		
		System.out.println("Introduce x: "); // pedir al usuario x
		x = scan.nextInt(); // guardar x
		
		// operaciones
		y = (int) ((a * Math.pow(x, 2)) + (b * x) + c); // aplicar la formula y aplicar cast por la x elevado a 2
		
		// resultado
		System.out.println("El valor de y es: " + y); // imprimir resultado
		
		// cierre escáner
		scan.close();
		
		
	}

}
