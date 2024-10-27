import java.util.*;
public class Ejercicio20 {

	public static void main(String[] args) {
		//activamos la libreria java
		Scanner terminal = new Scanner (System.in);
		// Definimos la variable como int; recuerda que es importante definilar fuera de do y de while para que el programa se ejecute.
		int num;
		
		/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
		introduzca un número negativo.*/
		do {// damos las indicaciones al usuario:
			System.out.println("si desea detener el programa, entonces introduzca un número negativo.");
			System.out.println("Introduce un número positivo para elevarlo al cuadrado :");
			//leemos el número que el usuario nos ha dado:
			num = terminal.nextInt();
			// generamos la condición de que el número sea mayor o = a 0 para que se ejecute la operación numero elevado al cuadrado (num * num):
			if (num >= 0) {
				System.out.println("El número introducido: "+num + " elevado al cuadrado es: "+num * num);
			 }
			//creamos un ciclo que se repetirá hasta que el usuario ingrese un número negativo.
		}while (num >= 0);	
		System.out.println("¡Hasta pronto!");
		
		//cerramos terminal: Es importante cerrarla después del bucle, para evitar errores.
		terminal.close();

	}
}



