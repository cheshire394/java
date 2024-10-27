
package tema2;
// primero importamos la clase Scanner, recuerda que la S debe de ir en mayúscula.
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// con clase scanner crea un programa en el que un alumno introduzca una nota y nos muestre si es apto o no.:
		// Llamamos a la libreria:
		Scanner teclado = new Scanner (System.in);
		
		//Pedimos al usuario que introduzca la nota:
		System.out.println("Introduce tu nota: ");
		
		//definimos la variable con Scanner:
		Double nota = teclado.nextDouble();
        msg = " "
		//utilizamos el operador ternario: 
		if (nota > 0 && nota >= 10) {
		    msg = (nota>= 5) ? "aprobado" : "suspendido";
			System.out.println (" Felicidades eres apto; tu nota es de :"+nota + "operador"+msg);
		}
			else {
				System.out.println (" No eres apto; tu nota es de :"+nota);
			}
	}
	}


