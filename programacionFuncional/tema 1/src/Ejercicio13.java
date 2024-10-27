import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		//invocamos a la biblioteca:
		Scanner terminal = new Scanner (System.in);

		// pedimos al usuario el precio del producto y definimos la variable como double:
		System.out.println("Introduce el precio del producto :");
		double precio = terminal.nextInt();
		//cerramos terminal:
		terminal.close();


		/*En un determinado comercio se realiza un descuento dependiendo del
precio de cada producto. Si el precio es inferior a 6 euros, no se hace
descuento; si es mayor o igual que 6 euros y menor que 60 euros, se
hace un 5% de descuento, y si es mayor o igual que 60euros, se hace un
10 % de descuento. Programa que lee el precio de un producto y nos 
calcula y escribe su precio final. */

		//zona de operaciones:
		if (precio >= 6) {
			double descuento = precio * 0.05;
			double resultado = precio - descuento;
			System.out.println("El precio del productos con un 5% de decuento es de: "+resultado);
			
		}
		else if (precio >= 60) {
			double descuento = precio * 0.10;
			double resultado = precio - descuento;
			System.out.println("El precio del productos con un 10% de decuento es de: "+resultado);
			
		}
		else {
			System.out.println("El producto no tiene descuento");

		}
	}

}

