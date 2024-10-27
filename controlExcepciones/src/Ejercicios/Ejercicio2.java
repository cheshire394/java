package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int NUM = 5;
        int[] enteros = new int[NUM];
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        int posicion = 0;
        int divisor = 0;

        try {
            while (cont < NUM) {
                System.out.println("Introduce una posición del array:");
                while (true) {
                    try {
                        posicion = Integer.parseInt(teclado.nextLine());
                        if (posicion < 0 || posicion >= NUM) {
                            throw new ArrayIndexOutOfBoundsException("Posición fuera de rango: " + posicion);
                        }
                        break; // Salir del bucle si todo es correcto
                    } catch (NumberFormatException e) {
                        System.out.println("No se ha introducido un número válido para la posición. Inténtalo de nuevo.");
                    }
                }

                System.out.println("Introduce un divisor:");
                while (true) {
                    try {
                        divisor = Integer.parseInt(teclado.nextLine());
                        if (divisor == 0) {
                            throw new ArithmeticException("El divisor no puede ser cero.");
                        }
                        break; // Salir del bucle si todo es correcto
                    } catch (NumberFormatException e) {
                        System.out.println("No se ha introducido un número válido para el divisor. Inténtalo de nuevo.");
                    }
                }

                enteros[posicion] = 100 / divisor;
                cont++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice de rango introducido no válido para el Array: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        } finally {
            System.out.println("Cerramos teclado");
            teclado.close();
        }
    }
}

