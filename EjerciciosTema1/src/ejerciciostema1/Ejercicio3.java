package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Modifica el ejercicio anterior para que, indicando dos números, 
		por ejemplo, num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2. */
		
		// variables
		Scanner scan = new Scanner(System.in);
		int num1, num2, resto, cantidad;
					
		// pedir datos
		System.out.println("Introduce el primer número entero: ");
		num1 = scan.nextInt();
					
		System.out.println("Introduce el segundo número entero: ");
		num2 = scan.nextInt();
					
					
		// calcular la cantidad que hay que sumarle para que num1 sea múltiplo de num2
		resto = num1%num2;
		cantidad = num2 - resto;
					
		// mostrar solución
		System.out.println("Para que " + num1 + " sea múltiplo de " + num2 + ", hay que sumarle " + cantidad);
	}

}
