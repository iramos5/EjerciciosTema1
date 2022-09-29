package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Modifica el ejercicio anterior para que, indicando dos números, 
		por ejemplo, num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2. 
		*/
		
		// variables
		Scanner scan = new Scanner(System.in); // se inicia el escáner
		int num1, num2, resto, cantidad; // variables enteras
					
		// pedir datos
		System.out.println("Introduce el primer número entero: "); // se pide el primer numero entero al usuario
		num1 = scan.nextInt(); // se introduce el primer numero
					
		System.out.println("Introduce el segundo número entero: "); // se pide el segundo numero entero al usuario
		num2 = scan.nextInt(); // se introduce el segundo numero
					
					
		// calcular la cantidad que hay que sumarle para que num1 sea múltiplo de num2
		resto = num1%num2; // calculo del resto al dividir el primer numero con el segundo
		cantidad = num2 - resto; // calculo de la cantidad que hay que sumarle al primer numero
					
		// mostrar solución
		System.out.println("Para que " + num1 + " sea múltiplo de " + num2 + ", hay que sumarle " + cantidad); // respuesta que se muestra al usuario
		
		// cierre escáner
		scan.close();
	}

}
