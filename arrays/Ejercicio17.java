import java.util.*;
public class Ejercicio17 {

	public static void main(String[] args) {
		/*17.Realiza un programa que lea una cadena y diga cuántos caracteres no
		numéricos hay.*/

		String msg ;
		int contadorChar = 0;
		int contDigiChar=0;
		Scanner terminal = new Scanner(System.in);

		//pedimos al usuario que ingrese una cadena:
		System.out.println("Ingresa un mensaje: ");

		msg = terminal.nextLine();

		//creamos un bucle que recoore todas las posiciones del array
		for (int i = 0; i < msg.length(); i++) {
			//contamos todos los caracteres que se ingresen inicialemente
			contadorChar ++;
			//pero si ese caracter es numerico el contador va a descender
			if((msg.charAt(i) == '1') || (msg.charAt(i) == '2') ||(msg.charAt(i) == '0')
					|| (msg.charAt(i) == '3') || (msg.charAt(i) == '4') ||
					(msg.charAt(i) == '5') || (msg.charAt(i) == '6')|| 
					(msg.charAt(i) == '7') || (msg.charAt(i) == '8')||(msg.charAt(i) == '9') ){
				contadorChar --;
			}
		}

		//finalmente imprimimos el contador actualizado
		System.out.println("EL número de letras es de "+contadorChar);


		//Tambies podemos utilizar el método java Character.isDigit();
		//que busca números en cadenas de caracteres:

		for (int i = 0; i < msg.length(); i++) {
			//contamos todos los caracteres que se ingresen inicialemente
			
			contDigiChar++;
			//pero si ese caracter es numerico el contador va a descender
			//is digit es un metodo booleano, aqui retornar true.
			if(Character.isDigit(msg.charAt(i))) {
				contDigiChar--;
			}

		}
		//finalmente imprimimos el contador actualizado
		System.out.println("EL número de letras"
				+ "con Character.isDigit es de "+contDigiChar);


		terminal.close();
	}

}
