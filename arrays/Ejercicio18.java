import java.util.*;
public class Ejercicio18 {

	public static void main(String[] args) {
		/*18. Realiza un programa que lea una cadena. El programa nos dirá si la
		cadena contiene todos los caracteres numéricos o no.*/

		String msg ;

		Scanner terminal = new Scanner(System.in);

		System.out.println("Introduce un mensaje: ");
		msg = terminal.nextLine();


		// Verificar si todos los caracteres son numéricos
		boolean todosNumeros = true;
		for (int i = 0; i < msg.length(); i++) {
			//Character.isDigit es un método Java que que verifica si en una cadena hay 
			//un número
			// SI NO ES NUMERO, EL CARACTER i de msg, el bool es falso.
			if (!Character.isDigit(msg.charAt(i))) {
				todosNumeros = false;
				break; // No es necesario continuar verificando si ya encontramos un no-numérico
			}
		}

		// Mostrar el resultado
		//si todosNumeros continua true:
		if (todosNumeros) {
			System.out.println("La cadena contiene solo caracteres numéricos.");
		} else { //sino
			System.out.println("La cadena NO contiene solo caracteres numéricos.");
		}
		terminal.close();
	}

}

