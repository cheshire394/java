
public class Ejercicio9 {
	/*9. Rellena un array con el resultado del cálculo del factorial de los números
		del 1 al 20 y muestra posteriormente su contenido en pantalla.
		NOTA: En una variable de tipo int no cabe el factorial de 20*/
	// recuerda que el factorial es la multiplicacion de los resultados de la multiplicacion
	//de un número desde si mismo hasta 1.
	
	//damos el valor al parametro "numero" para que nos calcule el resultado de los factoriales
	// del 1 al 20.
	
	public static  long calculoFactorial (int numero) {
		long resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
			}
		return resultado;			
		}
	
	//METODO QUE MUETSRA UN VECTOR QUE RECIBE POR PARATRO
	public static void mostrar(long vector[]) {
		for (int i = 0; i<vector.length; i++) {
			System.out.println(vector[i]+ " ");
		}
	}

	

	public static void main(String[] args) {
		
		//declaramos la constante
		final int FINAL_ARRAY = 20;
		long [] vector = new long [FINAL_ARRAY];
		//relleno array
	for (int  i = 0; i< FINAL_ARRAY; i++) {
			//LOS FACTORIALES DEBEN DE EMPEZAR POR 1, Y NO POR 0 COMO LOS ARRAYS
		vector[i]= calculoFactorial(i+1);
	}//cierre for
	
	//muestro el array
	mostrar(vector);
	}

}
