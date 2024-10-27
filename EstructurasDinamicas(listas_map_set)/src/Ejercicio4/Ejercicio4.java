package Ejercicio4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

	/*Ejercicio 4
Escribe un programa que contenga un método que acepte como
parámetro una lista (ArrayList) de números enteros mayores
que 0, pudiendo contener elementos duplicados.

 Implementa un método
que sustituya cada valor repetido por 0. Para terminar, realiza un método
que muestre el array modificado.

Nota: Necesitarás otro método para rellenar la lista de enteros. Le irá
pidiendo números al usuario hasta que este introduzca un número
negativo.*/


	public static void add (List<Integer>lista, int numero) {

		lista.add(numero);
	}


	
	
	
	//BUSCAR DUPLICADOS EN UNA LISTA
	public static void Buscarduplicados(List<Integer>lista) {
		//creamos dos ciclos for, uno que recorra la lista y otro que compare cada uno de los elementos
		for(int i = 0 ; i < lista.size()-1; i++) {
			int elementoActual = lista.get(i);
			for(int j = i+1; j < lista.size(); j++) {
				if(elementoActual == lista.get(j)) lista.set(j, 0);}}} //los sustituye por otro valor
		
	


	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in); 


		//creamos el la lista
		ArrayList<Integer> lista = new ArrayList<Integer>(); 



		while(true) {
			System.out.println("Introduce un numero positivo");
			int numero = terminal.nextInt(); 

			if(numero < 0)break;
			else {
				Ejercicio4.add(lista, numero);

			}

		}

		System.out.println(lista);

		Ejercicio4.Buscarduplicados(lista);

	}

}
