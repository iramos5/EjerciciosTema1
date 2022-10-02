package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Pide dos números al usuario. Deberá mostrarse true si ambos números son iguales y false en caso contrario.

		// variables
		Scanner scan = new Scanner(System.in); // iniciar escáner
		int num1, num2; // variables
		boolean iguales = true; // boolean
		
		// introducir datos
		System.out.println("Introduce el primer número: "); // pedir al usuario el primer número
		num1 = scan.nextInt(); // guardar el primer número
		
		System.out.println("Introduce el segundo número: "); // pedir al usuario el segundo número
		num2 = scan.nextInt(); // guardar el segundo número
		
		// operaciones
		iguales = num1 == num2; // para que sea true los dos números tienen que ser iguales
		
		// solución
		System.out.println(iguales); //mostrar respuesta por pantalla
		
		// cierre escáner
		scan.close();
				
	}

}
