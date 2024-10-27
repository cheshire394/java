import java.util.*;
public class Ejercicios19 {

	public static void main(String[] args) {
		//activamos a la libreria de java con el método Scanner:
		Scanner terminal = new Scanner (System.in);
		
		/*definimos la variable num como int ( es importante definirla fuera del DO para evitar errores, si la definimos como int dentro de DO o while 
		NO EJECUTA.*/
		int num;
		
		//crearemos un programa que solamente escriba los números menores de 100.
		
		/*Vamos a utilizar un ciclo while que nos permita introducir los números en terminal
		 * aquellos números que cumplan la condición de ser menor que 100 apareceran en la terminal.
		 * sin embargo los que sean mayores o igual a 100 serán ignorados.*/
		do { //dentro de do, debe ir la sentencia; es decir el print con las indicaciones que le queremos dar al usuario:
			System.out.println("Introduce un número (para salir del ciclo escriba un número mayor o igual a 100): ");
			
			//definimos las variables: es importante recordar que dentro de do no se puede definir el type de la variable:
			 num = terminal.nextInt();
		} while (num < 100);
		if (num < 100) {
		System.out.println("el numero introducido es "+num);
		}
		else {
			System.out.println("El número introducido es mayor o igual a 100, salimos de while");
			
		}
		
		
		
		

	}

}
