import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importamos la biblioteca:
		Scanner teclado = new Scanner (System.in);

		//declaramos las variables como integer y las vinculamos con la terminal:
		System.out.println("Introduce un primer número: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce un segundo número: ");
		int num2 = teclado.nextInt();

		teclado.close();

		//REALIZA UN PROGRAMA QUE LEE DOS NÚMEROS INT Y NOS DICE SI SON IGUALES O NO:
		if (num1 == num2) {
			System.out.println("Los dos números introducidos son iguales");

		} 
		else { System.out.println("El número "+num1+ " y el número "+num2+ " no son iguales");

		}
	}}


