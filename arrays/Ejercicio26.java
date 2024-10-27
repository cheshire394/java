
public class Ejercicio26 {

	
	public static void rellenarMatriz() {
		
		int [][] nuevaMatriz = new int[2][4];
		
		for(int i = 0; i < nuevaMatriz.length; i++) {
			
			for(int j= 0; j < nuevaMatriz[0].length; j++) {
				
				nuevaMatriz[i][j]= (int)(Math.random()*(9-1)+1); 
				
				
				
			}
			
			
			
		}
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		//ESTA MAL MATRIZ = [][]
		
		/*26. Crear una matriz de 3×3 con los números del 1 al 9. Después, mostrar
		por pantalla la matriz.*/
		
		
		rellenarMatriz(); 
		
		
		
		
		
		
		int [] [] [] tripleMatriz = {
				{{1,2,3},{4,5,6},{7,8,9}},
				{{1,2,3},{4,5,6},{7,8,9}},
				{{1,2,3},{4,5,6},{7,8,9}}

		};//cierre matriz
		/*PREGUNTAR DUDA: CUANDO NOS EXPLICARON QUE HABIA QUE PONER [0] EN LOS
		 * FOR, PORQUE 0 Y NO i y j SUCESIVAMENTE EN CADA CICLO*/

		//EL primer for recorre as filas de la matriz
		for(int i = 0; i < tripleMatriz.length; i++) {
			//el segundo for recorre las Columanas 
			for(int j = 0; j<tripleMatriz[0].length; j++) {
				for(int k = 0; k<tripleMatriz[0].length; k++) {
					System.out.print(tripleMatriz[i][j][k]+ "\t");
				}
			}
			System.out.println();//salto de linea despues de cada fila
		}
		


	}

}
