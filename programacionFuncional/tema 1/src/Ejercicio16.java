import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		/*Programa que lee una nota numérica y escribe la correspondiente
calificación:
NOTA
INFERIOR A 5
5
MAYOR QUE 5 Y MENOR QUE 7
ENTRE 7 Y 8.9
IGUAL O MAYOR QUE 9
CALIFICACIÓN
SUSPENSO
SUFICIENTE
BIEN
NOTABLE
SOBRESALIENTE */

		// invocamosla libreria java: 
		Scanner terminal = new Scanner (System.in);

		//Le pedimos al usuario que ingrese su nota y definimos la variable como Double:
		System.out.println("Introduzca su nota : ");
		double nota = terminal.nextDouble();
// NO ENTIENDO PORQUE ME DA FALLO CUANDO METO UN DECIMAL Y CUANDO METO UN INTEGER NO CUANDO LO HE DEFINIDO COMO DOUBLE...
		//cerramos terminal
		terminal.close();
		//Zona de operaciones:
		if (nota < 5) {
			System.out.println("Suspensa");	
		}
		else if (nota >= 5 && nota < 7) {
			System.out.println("Suficiente");
		}
		else if (nota >= 7 && nota < 8) {
			System.out.println("Notable");
		}
		else if (nota >= 9) {
			System.out.println("Sobresaliente");
		}
		else { 
			System.out.println("Valor insertado no válido");
		}
	}




	}


