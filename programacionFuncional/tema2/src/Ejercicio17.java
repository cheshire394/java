package tema2;

import java.util.*;
public class Ejercicio17 {

	public static void main(String[] args) {
		//activamos la libreria scanner:
		Scanner terminal = new Scanner(System.in);
		//solicitamos al usurio que ingrese un número y declaramos la variable como int:
		int num = 0;
		boolean errNum = false; //creo una variable para comprobar números erróneos
		
		
		/* crea un programa que genere un número mayor a 2 y si no cumple las condiciones solicita 
		 * al usuario que introduzca un nuevo número:
		 */
		//COMENZAMOS EL EJERCICIO CON DO-WHILE, YA QUE DESCONOCEMOS EL NÚMERO DE VECES QUE EL USUARIO INGRESARÁ NÚMEROS
		//PERO AL MENOS EJECUTARÁ UNA VEZ:
		do { 
			if(errNum == false){
				System.out.println("Introduce un número mayor a 2: ");//pido dato
			}
			if(errNum == true){
				System.out.println("Incorrecto, el número introducido "+num + " es menor o igual a 2");
				System.out.println("Introduce un nuevo numero : ");
			}
			num = terminal.nextInt();//recojo el dato
			errNum = true;
		}
		while ( num < 2);
			System.out.println("Número correcto");
			
		}
		
		
		

	}


