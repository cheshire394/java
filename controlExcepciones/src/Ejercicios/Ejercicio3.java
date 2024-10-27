package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {


	public static int[] rellenarArray(int [] array) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		Scanner terminal = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (9 - 1) + 1);  // Genera números aleatorios entre 1 y 9
			//array[6]= 10; //PROVOCO FALLO DENTRO DEL METODO
		}

		//EJEMPLO DE EXCECCION LAZADA DENTRO DEL PROPIO MÉTODO

		System.out.println("Array ya ha sido creado, Accede a una posicion del array: ");
			int posicion = SoloNumeros(terminal);
			
		if(posicion < 0 || posicion>= array.length)throw new ArrayIndexOutOfBoundsException();//CONDICIONADO
		System.out.println("el numero que contiene esa posicion es "+array[posicion]);
		
		return array;
	}







	public static void mostrarArray(int [] array) throws NumberFormatException {

		for(int cp : array) {
			System.out.println(cp);
		}

	}


	public static int SoloNumeros(Scanner terminal) {

		while(true) {
			
			String teclado = terminal.nextLine();

			try {	
				return Integer.parseInt(teclado);

			}catch(NumberFormatException NoNumero) {
				System.out.println("El caracter introducido no es un numero");
				System.out.println("Introduce una número: ");
			}
		}

	}




	public static void main(String[] args) {
		/*Haz uso de la modularidad para modificar el ejercicio anterior, de forma
		que haya un método que muestre el contenido del array y otro que rellene
		el array y desde el main se llame a ambos.
		Dentro del método rellenaArray se lanzarán las excepciones de
		IndexOutOfBoundsException y ArithmeticException, las cuales serán
		capturadas en el método main. En el método se capturará la excepción
		NumberFormatException.*/



		Scanner terminal = new Scanner(System.in);

		int [] array = new int[5];







		try {



			rellenarArray(array);


			//EJEMPLO DE EXCEPCION CAPTURADA DESPUES DE LLAMAR AL METODO(PODRIA SER ANTES TAMBIÉN)
			System.out.println("Introduce un divisor: ");
			int divide = SoloNumeros(terminal);

			if(divide == 0 )throw new ArithmeticException(); //CAPTURAMOS EL ERROR SOLO SI CUMPLE LA CONDICION

			double division = 10 / divide ;
			System.out.println("Resultado de la division "+division);

		}catch(ArrayIndexOutOfBoundsException rangos) {
			System.out.println("El array ha sobrepasado los rangos limites");
		}catch(ArithmeticException zero) {
			System.out.println("No se puede dividir por 0");
		}



		System.out.println("PERO MI PROGRAMA CONTINUA.... NO SE DETIENE");






	}

}
