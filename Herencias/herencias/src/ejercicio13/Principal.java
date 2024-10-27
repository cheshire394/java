package ejercicio13;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Alumno2 a2[] = new Alumno2[5];
		Scanner sc = new Scanner(System.in);
		// Crear alumnos
		for (int i = 0; i < a2.length; i++) {
			System.out.println("Introduzca el nombre del alumno: ");
			String nombre = sc.next();
			System.out.println("Introduzca la edad del alumno: ");
			int edad = sc.nextInt();
			Alumno2 aux = new Alumno2(nombre, edad);
			a2[i] = aux;
		}
		// Comparaciones
		for (int i = 1; i < a2.length; i++) {
			if(a2[i].esIgual(a2[0])) {
				System.out.println("El alumno "+i+" es igual que el primero");
			}
			else if(a2[i].esMayor(a2[0])) {
				System.out.println("El alumno "+i+" es mayor que el primero");
			}
			else
				System.out.println("El alumno "+i+" es menor que el primero");
			System.out.println();
		}
			
		// Para los vehículos sería lo mismo prácticamente	
	}
}
