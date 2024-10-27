package tema2;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invocamos a la biblioteca:
		Scanner teclado = new Scanner (System.in);
// Crea un programa que nos cambie dolares por euros cuando introducimos una cantidad:
		
		//EN primer lugar le pedimos al usuario que introduzca una cantidad:
		System.out.println("Introduce la cantidad de dolares: ");
		Double dolares = teclado.nextDouble();
		double euros = 0.94;
		
	
		
		//Realizamos la conversión: 1 dolar, equivale a 0,94 cent: le restamos los 6 centimos que le faltan:
			euros = dolares * 0.94 / 1;
			
		// imprimimos el resultado:
			System.out.println("los euros que tienes son de :"+euros+" euros");
			
			//aplicamos un condicional: si cambiamos menos de 100 dolares, la comisión será del 0,20%;
			if (dolares < 100){
				dolares = (0.2*dolares / 100);
				System.out.println("La comisión es de: "+dolares);
			} else {
					System.out.println("No cobramos comisión");
					
				}
		


	}

}
