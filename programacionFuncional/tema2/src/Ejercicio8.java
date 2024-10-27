import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		//invocamos a la biblioteca Java:
		Scanner terminal = new Scanner (System.in);

		//Pedimos al usuario que ingrese dos números y los defininimos como int:
		System.out.println("Introduzaca un primer número: ");
		int num1 = terminal.nextInt();
		System.out.println("Introduzaca un primer número: ");
		int num2 = terminal.nextInt();
		terminal.close();
		//Programa que lee dos números, si son positivos los suma, si son
		//negativos los resta y si alguno es nulo saca un mensaje de error.

		//ZONA DE OPERACIONES:
		if (num1  >= 0 && num2 >= 0 )  {
			int suma = num1 + num2;
			System.out.println("número 1 + numero 2 = "+suma);
		}
		else if (num1  < 0 && num2 < 0 ){
			int resta = num1 - num2;
			System.out.println("número 1 + numero 2 = "+resta);
		}
		else {
			System.out.println("valor no válido");

		}
	}
}


