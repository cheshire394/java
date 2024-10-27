import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// En primer lugar vamos a invocar a la libreria:
		Scanner terminal = new Scanner (System.in);

		// Ahora vamos a pedir al usuario que ingrese una temeperatura y vamos a definir la variable que necesitamos:
		System.out.println("Registra la temperatura para recibir una sugerencia : ");
		int temperatura = terminal.nextInt();

		/* Escribe un programa que lea una temperatura introducida a través de
teclado y muestre por pantalla la actividad más apropiada para dicha
temperatura teniendo en cuenta los siguientes criterios.
ACTIVIDAD TEMPERATURA IDONEA
Natación temp > 30
Tenis 20 < temp <= 30
Golf 10 < temp <= 20
Esquí 5 < temp <= 10
Parchís temp <= 5 */
		if (temperatura > 30 ) {
			System.out.println("Recomendable hacer natación");
			
		}
		else if (temperatura >20 && temperatura <= 30 ) {
			System.out.println("Recomendable hacer Tennis");
		}
		else if (temperatura >10 && temperatura <= 20 ) {
			System.out.println("Recomendable hacer Golf");
		}
		else if (temperatura > 5 && temperatura <= 10 ) {
			System.out.println("Recomendable hacer Tennis");
		}
		else if (temperatura <= 5 ) {
			System.out.println("Recomendable jugar al Parchís");
		}
		
	
		
		// Vamos a comenzar el ejercicio con condicional switch: ya que todas las sentencias se basan en una sola variable:
		/*switch (temperatura) {
		case 1: if (temperatura > 30) {
			System.out.println("Recomendable hacer Natación");
			break;
		}
		case 2: if (temperatura > 20 && temperatura <= 30)  {

			System.out.println("Recomendable hacer Tennis");
			break;
		}

		case 3: if (temperatura > 10 && temperatura <= 20) {
			System.out.println("Recomendable hacer Golf");
			break;
		}
		case 4: if (temperatura > 5 && temperatura <= 10) {
			System.out.println("Recomendable hacer Esquí");
			break;
		}

		case 5: if (temperatura >= 5) {
			System.out.println("Recomendable jugar al parchís");
			break;
		}
		default:{
			System.out.println("No es un día válido");

		}	*/

	}
}


