import java.util.Arrays;

public class Ejercicio8 {
	
	

	public static void  intercambio() {
		
		int[] numero = new int[10];
		
		int ultima = 0;
		int primera = 0;
		
		
		//rellenamos array
		for(int i = 0; i < numero.length; i++) {
			
			numero[i]= (int)(Math.random()*(10-1)+1);
			
			primera = numero[0];
			ultima = numero[numero.length-1];
		
			}
		
	
		System.out.println(Arrays.toString(numero));
		
		for(int i = 0; i < numero.length; i++) {
			
			numero[0]= ultima;
			numero[numero.length-1] = primera;
			
		}
		
		System.out.println("  DESPUES DEL INTERCAMBIO ");
		System.out.println(Arrays.toString(numero));
		
		
			
		}
		
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		/*8. Dado un array de 10 casillas relleno con números aleatorios
		comprendidos entre 1 y 10 (ambos incluidos).
		a. Muestra su contenido en una línea de pantalla.
		b. Intercambia el valor de la primera casilla con el valor de la
		última casilla
		c. Muestra el contenido actual del array en una línea de
		pantalla.*/
		
		intercambio();
		
		
		
		final int  FINAL_ARRAY = 10;
		
		//creamos variables auxiliares
		int aux = 0;
		
		//Mejor declarrar el final de array con una constante.
		//por si huboera que modificar el programa en un futuro.
		int arrayAleatorio[] = new int[FINAL_ARRAY];
		
		System.out.print("Array original = ");
		//El primer for va a mostrar el arrar aleatorio original:
		for (int i = 0; i < FINAL_ARRAY; i++) {
			//generamos numeros aleatorios
			arrayAleatorio[i] = (int)(Math.random()*(10-1+1)+1);
			//mostramos numeros aleatorios en UNA SOLA LINEA
			
			System.out.print(+arrayAleatorio[i] + " ");
		}
		
		
		//NOTA---> IMPORTANTINSIMO ACORDARTE DE RESTAR AL FINAL DEL ARRAY -1
		
		
		//Ahora vamos a intercambiar dos posiciones del array utilizando variable auxiliares
		 aux = arrayAleatorio[0]; //aux recoge el valor de la posición 0.
		 arrayAleatorio[0] = arrayAleatorio[FINAL_ARRAY-1];//la pos 0 (ya copiada) recoge el valor 
		 												//del final del array
		 arrayAleatorio[FINAL_ARRAY-1] = aux; //le damos al final del array el valor del auxiliar.
		 //Añadimos salto de linea
		 System.out.println();
		 System.out.print("Array intercambiado = ");	
		 //recorremos el array modificado:
		 for( int copiaArray: arrayAleatorio) {
			 System.out.print(copiaArray + " ");
		 }
		
	}

}
