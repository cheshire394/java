package Ejercicios;

import java.util.Scanner;

public class Ejercicio2_2 {

	private static int leerNumeroEntero(Scanner teclado) {
		while (true) {
			String input = teclado.nextLine();
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Entrada no válida. Por favor, introduce un número entero.");
			}
		}
	}





	public static void main(String[] args) {
		final int NUM = 5;
		int[] enteros = new int[NUM];
		int posicion = 0;
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		int divisor = 0;

		try {
			while (cont < NUM) {
				System.out.println("Introduce una posición del array:");
				posicion = leerNumeroEntero(teclado);

				if (posicion < 0 || posicion >= NUM) {
					throw new ArrayIndexOutOfBoundsException("Posición fuera de rango: " + posicion);
				}

				System.out.println("Introduce un divisor:");
				divisor = leerNumeroEntero(teclado);

				if (divisor == 0) {
					throw new ArithmeticException("El divisor no puede ser cero.");
				}

				enteros[posicion] = 100 / divisor;
				cont++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indices de rangos introducidos no válidos para el Array: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("No se ha introducido un número válido: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error general: " + e.getMessage());
		} finally {
			System.out.println("Cerramos teclado");
			teclado.close();
		}
	}


}


