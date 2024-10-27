package tema2;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invocamos a la biblioteca:
		Scanner teclado = new Scanner (System.in);
// Crea un programa que nos cambie dolares por euros cuando introducimos una cantidad:
		
		//EN primer lugar le pedimos al usuario que introduzca una cantidad:
		System.out.println("Introduce la cantidad de dolares: ");
		Double dolares = teclado.nextDouble();
		double euros = 0.94;
		
		//Realizamos la conversión: 1 dolar, equivale a 0,94 cent:
			euros = dolares * euros;
			
		// imprimimos el resultado:
			System.out.println("los euros que tienes son de :"+euros+" euros");
			
			
		}
		
		
		

		
	}

