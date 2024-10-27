import java.util.*;
public class Ejercicio31 {

	//metodo que inicializa la matriz, los numeros los introduce el usuario.
	//este metodo esta vinculado con la terminal del equipo
	public static void crearMatriz (int [][] p_matriz, Scanner terminal) {

		for (int i= 0; i < p_matriz.length; i++) {
			for(int j= 0; j < p_matriz[0].length; j++) {
				System.out.print("Introduce un numero para la poscicion ["+i+"]["+j+"]");
				p_matriz[i][j] = terminal.nextInt();

			}

		}

	}

	//metodo que imprime la matriz previamente creada
	public static void imprimirMatriz (int [][] p_matriz) {
		for (int i= 0; i < p_matriz.length; i++) {
			for(int j= 0; j < p_matriz[0].length; j++) {
				System.out.print(p_matriz[i][j]+"\t");
			}
			System.out.println();//decorativo, para dar formato cuadrado
		}
	}


	/*METODO QUE SUMA LAS COLUMANAS DE LA MATRIZ, RECUERDA QUE DEBE DE 
	 * SER CON LAS MISMA DIMENSIONES PARA QUE SEA EFICAZ*/
	public static int sumaColumnas (int [][] p_matriz) {
			
			int	sumaColumna1 = p_matriz[0][0] + p_matriz[1][0]+ p_matriz[2][0];
			int	sumaColumna2 = p_matriz[0][1] + p_matriz[1][1]+ p_matriz[2][1];
			int	sumaColumna3 = p_matriz[0][2] + p_matriz[1][2]+ p_matriz[2][2];
			
			//la variable recoge la suma que sea más pequeña
			int auxiliar = Math.min(sumaColumna1, sumaColumna2);
			System.out.println("La suma menor, de las tres coslumnas es: ");
			// y luego la suma más pequeña se compara con la tercera columna
			// Y directamente nos retorna el resultado de la suma mas pequeña
			return Math.min(sumaColumna3, auxiliar);

	}
	
	
	/*Exite otro método más eficiente para sumar filas o columnas
	 * en el cual No es necesario que lo hagas manuealmente: 
	 * 
	 * VENTAJA: 
	 * (este metodo permitiria sumar un amplio numero de columanas:
	 * 
	 *  DESVENTAJA:
	 *  debes de recordar que tienes que crear un vector nuevo
	 *  y debes de recordar que ademas que los ciclos for J e i 
	 *  se invierten en posicion */
	
	public static int[] otroSumaColumnas(int[][] matriz) {
	   
	    int[] sumaColumnas = new int[matriz[0].length];

	    for (int j = 0; j < matriz[0].length; j++) {
	        for (int i = 0; i < matriz.length; i++) {
	            sumaColumnas[j] += matriz[i][j];
	        }
	    }
	    return sumaColumnas;
	}
	
	public static void main(String[] args) {
		/*31. Realiza un programa que cargue desde teclado una tabla de enteros de
		dimensión 3x3. El programa mostrará la columna en la que la suma de
		sus elementos sea menor.*/

		//Creamos la matriz de 3x3, pero no la inicializamos (lo hará un método):
		Scanner terminal = new Scanner (System.in);

		int [][] matriz = new int [3][3];

		//creamos e imprimimos la matriz
		Ejercicio31.crearMatriz(matriz, terminal);
		System.out.println("La matriz creada por el usuario es : ");
		Ejercicio31.imprimirMatriz(matriz);

		/*ahora mostraremos la columana, en la que la suma de sus elements
		 * sea menor: */
		System.out.println(Ejercicio31.sumaColumnas(matriz));
		
		
		/*Metodo de sumar columnas, con un codigo simple, pero bastante
		 * complejo de entender, tanto ene l main, como en el metodo en si*/
		
		System.out.println("suma columnas de GPT");
		int[] sumaColumnas = otroSumaColumnas(matriz);

	    for (int i = 0; i < sumaColumnas.length; i++) {
	        System.out.println("Suma de la columna " + (i + 1) + ": " + sumaColumnas[i]);
	
	    }
		terminal.close();
	}

}
