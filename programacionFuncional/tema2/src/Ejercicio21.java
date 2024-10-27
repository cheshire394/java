import java.util.*;
public class Ejercicio21 {

	public static void main(String[] args) {
		// activamos la biblioteca Java:
		Scanner terminal = new Scanner (System.in);


		/*EJERCICIO 21:Leer un número e indicar si es positivo o negativo. El proceso se
		repetirá hasta que se introduzca un 0.*/

		//En primer lugar vamos a definir la variable como int; es importante definirlas fuera del bucle para que compilen:
		int num;


		/*Para resolver esrte ejercicio, vamos a utilizar un cliclo do-while, que nos asegure que el usuario realiza
		 * al menos una ejecución, si la sentencia es 0, entonces el bucle while se detendra:*/

		do {
			//pedimos al usuario que nos ingrese un número:
			System.out.println("Introduce un número: ");
			//vinculamos la variable num con la terminal(importante no definir el tipo de variable dentro de un bucle):
			num = terminal.nextInt();	
			//Vamos a utilizar la condición if para indicar que si num es distinto a cero ejecute while:
			if (num != 0) {
				System.out.println("Si desea salir del bucle introduce 0, sino introduce un nuevo número: ");
			}
		}while (num!=0);

		//ceremos terminal después de while, para evitar que se cirre durante el ciclo:
		terminal.close();

	}
}
