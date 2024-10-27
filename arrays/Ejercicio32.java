
public class Ejercicio32 {

	//CREAMOS ATRIBUTOS CONSTANTES
	private final static int COLUMNAS = 4;
	private final static int FILAS = 3;
	//Creamos un metodo que cree un array con numeros aleatorios
	//CUANDO LA matrizObj ES ALEATORIA, PODEMOS IMPRIMIRLAR EN EL MIMOS METODO QUE LA CREA
	//CUANDO LA INTRODUCE EL USUARIO, DEBEN DE ESTAR EN METODOS DIFERENTES
	public static void crearmatrizObjAleatoria (int [][] matrizObj) {
		for(int i = 0; i < matrizObj.length; i++) {
			for(int j = 0; j < matrizObj[0].length; j++) {
				matrizObj[i][j] = (int)(Math.random()*(100-1+1)+1);
				//imprimimos la matrizObj --> NO olvides quitar LN
				System.out.print(matrizObj[i][j]+" \t");
			}
			System.out.println();//espacio decorativo para matrizObj cuadrada
		}
	}

	//imprima la primera fila de la matrizObj creada: 
	//vamos a crear un vector que recoja la primera fila
	public static void  crearImpirmirPrimeraFila (int [][] matrizObj) {
		//1ºPaso creamos vector que va recoge la primera fila de la matrizObj
		int [] vector = new int [COLUMNAS]; //final del vector (constante = 4)
		
		
		for(int j = 0 ; j < matrizObj[0].length; j++) {
			vector[j] = matrizObj[0][j];
		}
		
		//2º paso, imprimimos el vector creado
		System.out.print("primera fila de la matrizObj = ");
		for(int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+"\t");
		}

	}
	
	public static void crearImprimirUltimaFila(int [][]matrizObj) {
		
		//1º paso: creamos el vector que va a recoger la ultima fila
		int [] vector = new int [COLUMNAS];//final del vector (constante = 4)
		
		for(int j = 0; j < matrizObj[0].length; j++) {
			vector[j]= matrizObj[2][j];
		}
		
		//2º paso: imprimimos el vector creado
		System.out.print("ultima fila de la matrizObj = ");
		for(int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+"\t");
		}
	
	}
	
	/*AL SER COLUMNA, HAY ALGUNA MODIFICACION*/
	public static void crearImprimirPrimeraColumna (int [][]matrizObj) {
		//1ºpaso: crear la primera columna como un vector
		int [] vector = new int[FILAS]; //el final del array va a ser el num de filas
		for(int i = 0; i < matrizObj.length; i++) {
			vector[i]= matrizObj[i][0];
		}
		//2 paso imprimimos el vector creado.
		//2º paso: imprimimos el vector creado
				System.out.print("primera columna de la matrizObj = ");
				for(int j = 0; j < vector.length; j++) {
					System.out.print(vector[j]+"\t");
				}
	}
	
	public static  void  imprimirConjuntoMetodos (int [][]matrizObj) {
	/* cuando creaste este metodo, trataste de concadenar metodos con +
	 * daba fallo porque los metodos anteriores son void, no retornan 
	 * ningun valor que puedas sumar.
	 * Otro fallo que creaste, es intentar guardar los metodos en una variable
	 * y después imprimirla, esto también da fallo*/
		System.out.println("IMPRESION DEL CONJUNTO DE METODOS");
			crearImprimirUltimaFila(matrizObj) ;
			crearImpirmirPrimeraFila(matrizObj);
			crearImprimirPrimeraColumna(matrizObj);
	
	
	}
	




	public static void main(String[] args) {

		/*32. [Ampliación] Realizar un programa que cree y cargue una matrizObj de 3
filas por 4 columnas. Hacer un método que imprima la primera fila, otro
que imprima la última fila, otro que imprima la primera columna y otro
que imprima la primera fila, la última fila y la primera columna/*/

		//creamos constantes
		final int FILAS = 3;
		final int COLUMNAS = 4;

		int [][] matrizObj = new int [FILAS][COLUMNAS]; 

		System.out.println("creamos e imprimimos la matrizObj : ");
		Ejercicio32.crearmatrizObjAleatoria(matrizObj);

		//imprime solo la primera fila de la matrizObj creada
		Ejercicio32.crearImpirmirPrimeraFila(matrizObj);
		
		System.out.println();//decorativo
		
		//imprime solo la ultima fila de la matrizObj creado
		Ejercicio32.crearImprimirUltimaFila(matrizObj);
		
		System.out.println();
		
		//imprime y crea la primera columna 
		Ejercicio32.crearImprimirPrimeraColumna(matrizObj);

		System.out.println();
		
		//imprime todos los metodos
		Ejercicio32.imprimirConjuntoMetodos(matrizObj);

	}

}
