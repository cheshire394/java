import java.util.*;
public class Ejercicio1 {
	
	public static int sumaRecursiva (int numero) {
	//creamos una condición if para que la función se llame así misma hasta  que ese numero
	// se haya ido restando hasta llegar a 1 .
		if (numero != 1) { // aqui estamos sumando el numero sucesivamete por si mismo - 1 y en cada ciclo
			return numero + sumaRecursiva (numero - 1);
		} else { //cuando número se haya sumado tantas veces hasta llegar a 1 entonces entregarme 
			// retorname el número.
			return numero; //caso base
		}
	}
	
	
	public static void main(String[] args) {
		
		//declaramos variables:
		int numero;
		
		Scanner terminal = new Scanner (System.in);
		
		System.out.println("Introduce un número: ");
		numero =  terminal.nextInt();
		
		//creamos una condición para que número sea mayor de 1.
		while(numero <= 1) {
			System.out.println("Introduce un número mayor a 1: ");
			numero =  terminal.nextInt();
			if (numero > 1) {
				break;
			}
			
		}// cierre while
		
		//llamamos a la función para que se vincule con estos datos:
		int resultado = sumaRecursiva(numero);
		System.out.println("El resultado del la suma con la funcion del número: "+numero +" es "+ resultado);
		
		terminal.close();
	}

}
