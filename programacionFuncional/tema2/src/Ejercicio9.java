import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		//invocamos a la biblioteca java:
		Scanner terminal = new Scanner (System.in);
		
		// Pedimos al usuario que ingrese dos numeros y definimos la variable como int:
		System.out.println("Introduce un primer número: ");
		int num1 = terminal.nextInt();
		System.out.println("Introduce un segundo número: ");
		int num2 = terminal.nextInt();
		terminal.close();
	
		//Programa que lee dos números (distintos) y nos dice cual es el mayor:
		
		//zona de operaciones:
		if (num1 > num2) {
			System.out.println("El número "+num1 +" es más mayor que el número " +num2);
		}
		else if (num2 > num1) {
			System.out.println("El número "+num2 +" es más mayor que el número " +num1);
		}
		else {
			System.out.println("El número "+num1 +" es igual que el número " +num2);
		}
			

	}

}
