import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		//En primer lugar vamos a invocar a la biblioteca y a definir la variable:
		Scanner terminal = new Scanner(System.in);

		//Ahora vamos a solicitar al usuario que ingrese sus notas y a definir las variables:
		System.out.println("Introduce la nota de programación :");
		double asignatura1 = terminal.nextDouble();
		System.out.println("Introduce la nota de programación :");
		double asignatura2 = terminal.nextDouble();

		terminal.close();
		//Programa que lee desde teclado las notas en programación y marcas de
		//un alumno y nos dice si ha aprobado una o las dos asignaturas 
		
		// para resolver este ejercicio utilizamos condicionales con (&& = and), (y || = or) 
		// si ambas condiciones son verdaderas se ejecutar esta parte:
		if (asignatura1 >= 5 && asignatura2 >= 5) {

			System.out.println("Has aprobado las dos asignaturas");
		}	
		//si solo es verdadera una, pero la otra no, se ejecutará esta otra:
		else if (asignatura1 >= 5 || asignatura2 >= 5){
			System.out.println("Has aprobado una asignatura");
		}
		// si ninguna es verdadera, se ejecuta else:
		else {
			System.out.println("No has aprobado ninguna asignatura");
		}
	}
}

