import java.util.*;
public class Ejercicio28 {

	//metodo crear matriz
	//ESTE METODO TIENE VINCULACION CON LA TERMINAL
	public static void crearMatriz (int [][]matriz, Scanner terminal) {
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j< matriz[0].length; j++) {
				//el usuario introduce los valores
				System.out.println("introduce el valor para la posicion para la columna ["+ j+"] ["+i+"]");
				matriz [i][j]= terminal.nextInt();}}}
	


	

	//creamos metodo para imprimir matrices
	public static void imprimirMatriz(int [][]matriz) {
		//el primer for es para la fila
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				//recuerda quital el LN IMPORTANTE PARA OBTENER FORMATO CUADRADO
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();}}//ordena la distribucion de la matriz
	
	
	//CREAMOS METODO PARA SUMAR LAS DOS MATRICES CREADAS E IMPRESAS CON ANTERIORIDAD
	//ademas estamos diciendo que el metodo será una matriz nueva
	public static int [] [] sumarMatrices (int[][]matriz1, int[][]matriz2) {
		
		/*IMPORTANTE: PARA HACER OPERACIONES CON MATRICES, ESTAS DEBEN DE TENER LA MISMAS DIMENSIONES
		 * TANTO EN COLUMNAS COMO EN FILAS: primero vamos a comprobar que son iguales.*/
		// si las filas NO son iguales      o       las columnas No son iguales 
		if(matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
			System.out.println("error, las matrices introducidas deben tener la misma dimensiones");
			
		}
		/* CREAMOS LA MATRIZ NUEVA (DENTRO DEL METODO): puede ser basado en la matriz1 o la matriz2 
		 * porque ya hemos comprobado que tienen las mismas dimesiones */
				int [][] sumaMatriz = new int [matriz1.length][matriz1[0].length]; 
				
		//una vez hemos manejado ese posible fallo del metodo: quiere decir que filas y columnas 
		// son iguales, por lo tanto en el for podemos usar la matriz1 o la matriz2, xq el numero es el mismo
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[0].length; j++) {
				 sumaMatriz [i][j]= matriz1[i][j] + matriz2 [i][j];
				 
			}
			
		}
		return sumaMatriz;
		
	}


	public static void main(String[] args) {

		/*28. Crear dos matrices de nxn y sumar sus valores, los resultados se deben
almacenar en otra matriz. Los valores y la longitud, serán insertados por
el usuario. Mostrar las matrices originales y el resultado.*/

		Scanner terminal = new Scanner (System.in);

		//PEDIMOS DATOS PARA MATRIZ UNO
		System.out.println("Introduce un numero de filas a la matriz 1: ");
		int f1 = terminal.nextInt();
		System.out.println("Introduce un numero de columnas a la matriz 1: ");
		int c1 = terminal.nextInt();

		//creamos las matrices sin valores(no inicializada)
		int [][]matriz1 = new int [f1][c1];

		//PEDIMOS DATOS PARA MATRIZ UNO
		System.out.println("Introduce un numero de filas a la matriz 2: ");
		int f2 = terminal.nextInt();
		System.out.println("Introduce un numero de columnas a la matriz 2: ");
		int c2= terminal.nextInt();

		//creamos la matriz sin valores (no inicializada)
		int[][] matriz2 = new int[f2][c2];

		//creamos la matriz con POO (la inicializamos en el metodo)
		Ejercicio28.crearMatriz(matriz1, terminal);
		Ejercicio28.crearMatriz(matriz2, terminal);


		//impirmimos la primer matriz con POO
		System.out.println("Imprimimos la matriz 1");
		Ejercicio28.imprimirMatriz(matriz1);
		System.out.println("Imprimimos la matriz 2");
		Ejercicio28.imprimirMatriz(matriz2);

		//sumamos una matriz, es decir la creamos, pero no la imprimimos
		//por que el sumarMatrices solo las crea.
		
		int [] [] resultado = sumarMatrices (matriz1, matriz2);
		
		System.out.println("imprimimos la matriz sumada: ");
		Ejercicio28.imprimirMatriz(resultado);
		
		
		
		

	}

}
