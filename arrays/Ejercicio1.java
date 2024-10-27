import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*1. Realiza un programa que rellene un array de 10 enteros con los 10
		primeros números pares. A continuación, muestra el contenido del array.
		 */
		
		//aqui estamos creando un nuevo array con 10 posiciones.
		 int[] array  = new int[10];
		 //boolean ispar = false;
		 
		 //creamos un ciclo for que genere 10 números (pares e impares)
		 int posArray = 0; //Creamos una variable para recorrer las  posiciones del array
		 //Recorrer los primeros 20 números
		 for( int i = 1; i <= 20; i++) {
			if(i%2==0) {
				array[posArray] = i; //valor de celdas
				posArray++; //siguiente celda si es par.
			}
		 } //for que imprime los numeros del array creando una copia aux
		for(int aux:array) {
			System.out.println(aux);
		}
		
		//otra forma de hacerlo
		//pero tendria que poner el array [20]
		for (int i = 0; i <= array.length; i++) {
			if (i %2 == 0) {
			System.out.print(i);
		}
			
		}
		
		System.out.println();
		
		
		int [] num = new int [10];
		int posicion = 0; 
		
		while(posicion < 10) {
			
			int nuevoNum = (int)(Math.random()*(100-1)+1);
			
			if(nuevoNum % 2 == 0) {
				num[posicion]= nuevoNum;
				posicion++;
			}
		}	
		
		
		System.out.println(Arrays.toString(num));

	}

}
