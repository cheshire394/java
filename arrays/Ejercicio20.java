import java.util.*;
public class Ejercicio20 {

	public static void main(String[] args) {
		/*20. Realiza un programa que lea una frase y nos diga si es un palíndromo o
		no. Un palíndromo es una palabra o frase que se lee igual hacia adelante
		que hacia atrás. Para facilitar la codificación se deberán introducir las
		frases sin tildes. Ejemplos:*/
			//amo  la paloma
		
		String msg ; //contendra el mensaje original
		String vacio_revierte="";//contendra el mensaje al reves y ademas, nos ayudará a invertirlo
		boolean isPalindromo = false;
		Scanner terminal = new Scanner(System.in);

		System.out.println("Introduce un mensaje: ");
		msg = terminal.nextLine();
		
		//le quitamos los espacios a la cadena
		msg = msg.replace(" ", "");
		
		//si no quieres usar IgnoreCase 
		//cadena = cadena.toLowerCase();
		
		for(int i = msg.length()-1; i>= 0; i--) {
			vacio_revierte+= msg.charAt(i);
		}
		System.out.println("mesaje original: "+msg+ " mensaje revertido: "+vacio_revierte);
		
		if (vacio_revierte.equalsIgnoreCase(msg)) {
			isPalindromo = true;
		}
		
		System.out.println(isPalindromo);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
