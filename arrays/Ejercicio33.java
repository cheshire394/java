import java.util.Arrays;
import java.util.*;
public class Ejercicio33 {

	//creamos el atributo matriz
	private int [][] matriz; 
							
	private int columnas;
	private int filas;




	//creamos constructor parametrizado
	public Ejercicio33( int columnas, int filas) {

		this.columnas = columnas;
		this.filas = filas;
	}



	//creamos getter y setter
	public int[][] getMatriz() {
		return matriz;
	}



	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}



	public int getColumnas() {
		return columnas;
	}



	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}



	public int getFilas() {
		return filas;
	}



	public void setFilas(int filas) {
		this.filas = filas;
	}

	//creamos metodo toString MODIFICADO CON BUILDER PARA QUE IMPRIMA LA MATRIZ
	@Override
	public String toString() {
		/*el metodo builder creaba un String en el cual se alamacenaban
		 * varias cadenas de tipo Sring*/
		StringBuilder matriz = new StringBuilder();
		for (int i = 0; i < this.getMatriz().length; i++) {
	        for (int j = 0; j < this.getMatriz()[0].length; j++) {
	            matriz.append(this.getMatriz()[i][j]).append("\t");
	        }
		}
		return "Ejercicio33 [matriz=" + matriz.toString() + ", columnas=" + this.getColumnas() + ", filas=" + this.getFilas() + "]";
	}

	//METODOS QUE OPERAN 

	//a) Añadir elementos a la matriz
	public int [][] cargar(Scanner terminal){
		//creamos la matriz
		this.matriz = new int [this.getFilas()][this.getColumnas()]; 

		for(int i = 0; i < this.getMatriz().length; i ++) {
			for(int j=0; j < matriz[0].length; j++) {
				System.out.println("Introduce un elemento para la posicion"
						+ "["+i+"]["+j+"]");
				matriz[i][j]= terminal.nextInt();

			}
		}
		return matriz;
	}

	//creamos un metodo para ver la matriz (NO LO PIDE EL EJERCICIO)
	public void mostrarMatrizObj () {
		for(int i = 0; i < this.getMatriz().length; i ++) {
			for(int j=0; j < matriz[0].length; j++) {

				System.out.print(matriz[i][j]+"\t");

			}
			System.out.println();
		}

	}

	//b) Suma(): devuelve la suma de todos los valores de la matriz.
	public int sumaMatriz () {
		int suma = 0; 
		for(int i = 0; i < this.getMatriz().length; i ++) {
			for(int j=0; j < matriz[0].length; j++) {
				suma += matriz[i][j];
			}
		}
		return suma; 
	}

	//c) Máximo(): devuelve el valor máximo de los elementos de la matriz.
	public int valorMaximo () {

		int valorMax = Integer.MIN_VALUE; //valor de 0
		for(int i = 0; i < this.getMatriz().length; i ++) {
			for(int j=0; j < matriz[0].length; j++) {
				if(matriz[i][j] > valorMax) {
					valorMax = matriz[i][j];
				}
			}
		}
		return valorMax; 
	}

	//d) Mínimo(): devuelve el valor mínimo de los elementos de la matriz.e) Promedio(): 

	public int valorMinimo () {

		int valorMin = Integer.MAX_VALUE; //valor de 0
		for(int i = 0; i < this.getMatriz().length; i ++) {
			for(int j=0; j < matriz[0].length; j++) {
				if(matriz[i][j] > valorMin) {
					valorMin = matriz[i][j];
				}
			}
		}
		return valorMin; 
	}


	//e) Promedio(): devuelve el valor promedio de todos los elementos de la matriz.
	public double promedio () {
		int contadorElementos = 0; 
		double media = 0.0; 


		for(int i = 0; i < this.getMatriz().length; i ++) {
			for(int j=0; j < matriz[0].length; j++) {
				contadorElementos++;
				//utilizamos el metodo suma matriz, para calcular la media
				//sin necesidad de volver a sumar todos los numeros otra vez
				media = sumaMatriz()/ contadorElementos; 
			}
		}
		return media; 
	}

	/*f) Transpuesta(): devuelve un objeto de la clase Matriz resultado de
		intercambiar las filas por las columnas de la matriz original.*/

	public int [][] transpuesta(){
		/*ATENCION, YA EN LA CREACION HEMOS DADO A LAS FILAS EL LENGTH DE LAS COLUMNAS
		 * Y A LAS COLUMNAS EL LENGTH DE LAS FILAS, PARA INTERCAMBIAR POSICIONES*/
		int [][] nuevaMatriz = new int [this.getMatriz()[0].length][this.getMatriz().length]; 
		
		/*Si matriz tiene la mismas dimensiones en filas y columnas*/
		if ( this.getMatriz()[0].length == this.getMatriz().length) {
			for(int i = 0; i < this.getMatriz()[0].length; i ++) {
				for(int j=0; j < this.getMatriz().length; j++) {
				
					//aqui intercambiamos a la matriz original los 
					//valores
					nuevaMatriz[i][j]= this.getMatriz()[j][i];	
				}
				
			}	
			// Imprimimos la matriz transpuesta de manera similar al método mostrarMatrizObj()
	        System.out.println("Matriz transpuesta:");
	        for (int i = 0; i < nuevaMatriz.length; i++) {
	            for (int j = 0; j < nuevaMatriz[0].length; j++) {
	                System.out.print(nuevaMatriz[i][j] + "\t");
	            }
	            System.out.println();
	        }
			
			return nuevaMatriz;
			
		}//cierre de if
		return matriz;
	}
	public static void main(String[] args) {
		/*33. [Ampliación] Crear una clase llamada Matriz cuyo atributo es un array
		bidimensional de números enteros de cualquier tamaño.
		Tendrá un constructor con dos parámetros que serán el número de filas y
		de columnas de la matriz.
		Los métodos de la clase serán los siguientes:
		a) Cargar(): pedirá por teclado los elementos de la matriz.
		b) Suma(): devuelve la suma de todos los valores de la matriz.
		c) Máximo(): devuelve el valor máximo de los elementos de la
		matriz.
		d) Mínimo(): devuelve el valor mínimo de los elementos de la matriz.
		e) Promedio(): devuelve el valor promedio de todos los elementos
		de la matriz.
		f) Transpuesta(): devuelve un objeto de la clase Matriz resultado de
		intercambiar las filas por las columnas de la matriz original.
		g) toString(): devuelve un String con los elementos de la matriz con
		el formato del siguiente ejemplo:
		1 2 3 4 5
		2 6 7 8 9
		3 2 4 8 9*/

		//creamos el objeto matriz

		//int[][] matriz = int columnas, int filas
		Ejercicio33 matrizObj = new Ejercicio33 (3,3); 

		//creamos el Scanner para introducir los valores por teclado
		Scanner terminal = new Scanner (System.in);

		//creaamos la matriz en un objeto, dentro del metodo
		matrizObj.cargar(terminal);

		//imprimimos la matriz creada
		System.out.println("La matriz creada es la siguiente: ");
		matrizObj.mostrarMatrizObj();

		//imprimimos las suma de la matriz
		System.out.print("La suma de todos los elementos de la matriz es: ");
		System.out.println(matrizObj.sumaMatriz());

		//imprimimos el elemento más alto de la matriz
		System.out.print("Elemento con más valor de la matriz es: ");
		System.out.println(matrizObj.valorMaximo());

		//imprimimos el elemento más bajo de la matriz
		System.out.print("Elemento con menos valor de la matriz es: ");
		System.out.println(matrizObj.valorMinimo());

		//imprimimos la media de todos los numeros 
		System.out.print("imprimimos la media de todos los numeros: ");
		System.out.println(matrizObj.promedio());
		
		//crea una nueva matriz, que intercambie las columnas por las filas 
		// de la anterior matriz creada
		System.out.println("intercambie las columnas por las filas  ");
		System.out.println(matrizObj.transpuesta());

		//probamos el metodo to String modificado con builder
		System.out.println(matrizObj.toString());
	}

}
