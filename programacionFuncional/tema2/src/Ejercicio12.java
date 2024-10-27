import java.util.*; 
public class Ejercicio12 {

	public static void main(String[] args) {
		
		// invocamos a libreria java:
		Scanner terminal = new Scanner(System.in);
		
		//pedimos a al usuario que ingrese las variables y definimos el tipo de variable:
		System.out.println("Introduce cuantos km vas a recorrer: ");
		int km = terminal.nextInt();
		System.out.println("Introduce cuantos días vas a estar hospedado:  ");
		int dias = terminal.nextInt();
		//cerramos terminal:
		terminal.close();
		
	
		/*Diseñar un programa que calcule el precio de un billete de ida y vuelta
por avión, conociendo la distancia a recorrer, el número de días de
estancia y sabiendo que si la distancia es superior a 1.000 Km. y el
número de días de estancia es superior a 7, la línea aérea le hace un
descuento del 30 %. (Precio por kilómetro = 0,05€.). */
		
		//zonas de operaciones:
		double precio = (km * 0.05) * 2;
		
		if (km > 1000 && dias > 7) {
			double descuento = precio * 0.30;
			double resultado = precio - descuento;
			System.out.println("El precio del billete ida y vuelta es de: "+precio + " menos el 30% : "+resultado);
		}
		else {
			System.out.println("El precio del billete ida y vuelta es de: "+precio);
		}
		
		
	

	}

}
