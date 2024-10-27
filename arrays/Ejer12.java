
public class Ejer12 {



	public static void main(String[] args) {
		/*
		 * 12. Realiza un programa que sume todos los números pasados por línea de
		 * comando: $java Suma 4 67.6 9 2 $La suma es 82.6 Nota: Para ver cómo ejecutar
		 * un programa pasándole parámetros con Eclipse, visita la página web:
		 * http://www.comscigate.com/cs/valle/ejecutar.htm
		 */

		double suma = 0; 

		for (int i = 0; i < args.length; i++) {
			double copiaArray = Double.parseDouble(args);
			// mostramos el array
			System.out.println(copiaArray);
			suma += copiaArray;
		}

		System.out.println("$La suma es" + suma);

	}
}




