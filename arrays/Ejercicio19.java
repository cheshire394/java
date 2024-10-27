import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*19. Realiza un programa que lea una frase y nos la muestre al revés.*/
		
		String msg ;
		String vacio_revierte = "";

		Scanner terminal = new Scanner(System.in);

		System.out.println("Introduce un mensaje: ");
		msg = terminal.nextLine();
		
		for(int i =msg.length()-1; i >= 0; i--) {
			vacio_revierte += msg.charAt(i);
		}
		//mostramos resultados
		System.out.println("texto original: "+msg+" texto revertido: "+vacio_revierte);

	}

}
