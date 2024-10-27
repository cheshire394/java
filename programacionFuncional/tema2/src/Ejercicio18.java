package tema2;

import java.util.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		// Invocamos a la libreria java:
		Scanner terminal = new Scanner (System.in);
		
		//pedimos al usuario que ingrese los datos:
		System.out.println("Introduce un número > a 2: ");
		
		//definimos la variable introducida por el usuario como Double: 
		int num = terminal.nextInt();
		
		
		//cerramos terminal:
		
		/* crea un programa en el que el usuario tenga que introducir un número > a 2; y de ser correcto
		 * el programa va a leer todos los número pares inferiores o iguales al número introducido
		 * */
		//En primer lugar vamos a crear la condición de que el número sea mayor a 2:
		if (num <= 2) {
			System.out.println("Recuerda que el número debe de ser mayor a 2: ");
			
		}
		else {
			System.out.println("números pares menores o iguales a "+ num + ":");
			//creamos un ciclo for ya que conocemos el número de iteraciones que ha ingresado el usurio:
			for (int i = 2; i <= num; i +=2) /* i = 2 para que al llegar al 2 se detenga y no imprima más numeros.
											*la condición es que i (que inicialmente es 2, sea menos que num, y lo hará sumando dos en cada iteración*/
				System.out.println(i);		
		}

		//cerramos terminal:
		terminal.close();
	}

}
