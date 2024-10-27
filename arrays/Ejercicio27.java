import java.util.*;
public class Ejercicio27 {

	
	
	public static void rellenarMatrizAleatoria() {
		int [][] matriz = new int[3][4];

		for(int i = 0; i < matriz.length; i++ ) {
			
			for(int j = 0; j < matriz[0].length;j++) {
				
			matriz[i][j]= (int)(Math.random()*(10-1)+1); 
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();}}//salto de linea desues e cada fila
			
		
				
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		/*27. Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo
		con números aleatorios entre 0 y 10.*/
		Scanner terminal = new Scanner (System.in);
		
		rellenarMatrizAleatoria();
		

	/*	int n; 

		
		System.out.println("Introduce un numero de columnas a la matriz: ");
		n = terminal.nextInt();

		int [][] matriz = new int [5][n];

		//el primer for recorre las filas, es decir, 5 filas en este caso
		for(int i = 0; i<matriz.length; i++) {
			//el segundo for recorre las columnas (n);
			for(int j = 0; j < matriz[0].length; j++) {
				//OJO!! MIRA COMO  GENERAMOS NUMEROS ALEATORIOS EN UNA MATRIZ
				matriz [i][j] = (int)(Math.random()*(10-0+1)+0);// DE 0 AL 10
				//IMPRIMIMOS RESULTADOS:
				System.out.print(matriz[i][j]+ "\t");
			}
			System.out.println();//salto de linea despues de cada fila
		}*/


		terminal.close();

	}








}
