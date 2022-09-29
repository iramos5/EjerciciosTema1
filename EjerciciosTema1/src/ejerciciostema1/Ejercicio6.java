package ejerciciostema1;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
		 * La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
		 */
		
		// variables
		Scanner scan = new Scanner(System.in); // iniciar escáner
		int segundos1, minutos, horas, segundos2; // variables
		
		// introducir datos
		System.out.println("Introduce una cantidad de segundos: "); // pedir al usuario los segundos
		segundos1 = scan.nextInt(); // guardar segundos
		
		// cálculos
		horas = segundos1 / 3600; // los segundos entre 3600 nos dan la hora. 3600 viene de 60 * 60
		minutos = (segundos1 - (horas / 3600)) / 60; // los minutos se calculan quitandole a los segundos iniciales las horas que nos salieron, convertidas en segundos. luego dividimos por 60 en la conversión
		segundos2 = segundos1 - ((horas*3600)+(minutos*60)); // los segundos serían como el resto total de los segundos calculados en horas y minutos
		
		// solución
		System.out.println( segundos1 + " segundos son: " + horas + " horas, " + minutos + " minutos y " + segundos2 + " segundos."); // resultado por pantalla
	
		// cierre escáner
		scan.close();
		
	}

}
