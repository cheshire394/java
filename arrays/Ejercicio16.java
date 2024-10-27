import java.util.*;
public class Ejercicio16 {

	private Ejercicio16 [] vector1;
	private Ejercicio16 [] vector2;

	//getter y setter de arrays
	public Ejercicio16[] getVector1() {
		return vector1;
	}

	public void setVector1(Ejercicio16[] vector1) {
		this.vector1 = vector1;
	}

	public Ejercicio16[] getVector2() {
		return vector2;
	}

	public void setVector2(Ejercicio16[] vector2) {
		this.vector2 = vector2;
	}

	//metodo burbuja para descender un array:

	public static void descenderBurbuja (int[] vector2) {
		for (int i = 0; i < vector2.length-1; i++) {
			for(int j = 0; j < vector2.length-1-i; j++) {
				if(vector2[j] < vector2[j+1]) {
					//intercambiamos las posiicones
					int aux = vector2[j];
					vector2[j] = vector2[j+1];
					vector2[j+1]= aux;
				}
			}
		}
	}

	
	//metodo comparador para descender un array:
	
	public static void descenderComparator(int[] vector2) {
		Integer[] comparadorObj = Arrays.stream(vector2).boxed().toArray(Integer [] :: new);
		Arrays.sort(comparadorObj, Comparator.reverseOrder());
		for(int i = 0; i < vector2.length; i++) {
			vector2[i] = comparadorObj[i];
		}
	}

	//UNA VEZ HEMOS ORDEDANDO EL ARRAY PODEMOS UTILIZAR BINARYSARCH
	//creamos la variables que vamos a necesitar

	static int binSearch (int[] vector2, int numSearch) { 
		int izq =	0;
		int der = vector2.length-1; //IMPORTANTE -1
		int centro = (izq + der) /2;
		//mientras izq sea menor o = a derecha y el centro del vector no sea el número búscado:
		while ((izq <= der) && (vector2[centro] != numSearch)) {
			//si el numero buscado es menor que el centro --> centro va hacía la izquierda
			if (numSearch < vector2[centro]) {
				der = centro -1;
			}else {//si el numero buscado es mayor al centro, izquierda va hacia derecha
				izq = centro +1;
				centro = (izq + der)/2;
			}
		}// cierre while

		//si izq es mayor que derecha, retorna error (PORQUE EL ARRAY NO HA SIDO ORDENADO);
		if (izq>der) {
			return -1;}
		//sino devuelve centro. //si el numero buscado está en el centro, retorna centro;
		return centro;


	}




	public static void main(String[] args) {
		/*16. Implementa un programa que pruebe los métodos sort, equals, fill,
		toString y binarySearch de la clase Arrays (transparencia 32 apuntes).*/

		//RECUERDA QUE PARA UTILIZAR LOS METODOS ES NECESARIO IMPORTAR LA BIBLIOTECA

		final int FINAL_ARRAY = 10;



		//Creamos 2 vectores diferentes
		int [] vector1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] vector2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};


		//METODO EQUALS:
		//creamos una copia del vector1 PARA PROBAR EQUALS.
		int [] copiaVector1 = new int [vector1.length];

		//utilizaremos for normal para copiar el vector
		for (int i = 0; i < vector1.length;i++) {

			copiaVector1[i] = vector1[i];
		}
		//impirmimos la copia del vector1
		System.out.println();
		System.out.print("La copia del vector 1 usando for convecional = ");
		for (int i = 0; i < copiaVector1.length;i++) {
			System.out.print(" "+copiaVector1[i]+" ");
		}
		System.out.println();
		System.out.println("Metodos equals");
		//imprimimos resultados 
		System.out.println("El vector 1 es = a la copiaVector1 : "+vector1.equals(copiaVector1));
		System.out.println("El vector 1 es = al vector2 : "+vector1.equals(vector2));

		//METODO TO STRING:
		System.out.println("Metodo to String");
		System.out.println("vector1 = "+Arrays.toString(vector1));
		System.out.println("vector2 = "+Arrays.toString(vector2));

		//METODOS ARRAYS FILL
		//importante, fill, no imprime, solo modifica. NO PUEDES METERLO DENTRO DE UN SOP.
		Arrays.fill(vector1, 10); //cambia todos los valores el array a 10
		System.out.println("Utilizamos fill en vector1: "+Arrays.toString(vector1));
		//ahora vamos a modificar solo la posicion 1 hasta la  5 (por un 7) del array vector2
		Arrays.fill(vector2, 1, 5, 7);
		System.out.println("utilizamos fill en vector2: "+Arrays.toString(vector2));

		//como después de fill el Array ha quedado desordenado, vamos a ordenarlo
		Arrays.sort(vector2);
		System.out.println("Utilizamos sort en vector2: "+Arrays.toString(vector2));

		//binarySearch, RECUERDA QUE EL ARRAY TIENE QUE ESTAR PREVIAMENTE ORDENADO y el método debe de estar en SYSO.
		//buscamos en número 10 en el array vector2
		System.out.println("Método binarySearch que busca el número 10 "
				+ "está en la posición:  "+Arrays.binarySearch(vector2, 10));
		
		//descendemos con burbuja array  vector2:
		//descenderBurbuja(vector2);
		//System.out.println("Descendemos vector2 con burbuja: "+Arrays.toString(vector2));

		 //descendemos con comparator el vector 2:
		descenderComparator(vector2);
		System.out.println("Descendemos vector2 con comparator: "+Arrays.toString(vector2));
		
		  
		 
	}
}
