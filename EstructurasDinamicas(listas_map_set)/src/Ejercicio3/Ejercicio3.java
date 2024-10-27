package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

	/*Realizar un programa que lea tantos números enteros como desee el
usuario (se pedirá dicha información al usuario) y los introduzca en una
lista (ArrayList).
Muestra la lista, intercambia los números que se encuentren en la 2ª y 4ª
posición, y muestra de nuevo la lista por pantalla. Utiliza al menos 3
métodos: uno para introducir los datos, otro para mostrarlos y otro para
intercambiarlos.*/



	//metodo para introducir número a una lista
	public static void addNumeros (List<Integer> lista, int numero) {

		lista.add(numero); 


	}


	//metodo para mostrar la lista creada 

	public static void mostrarLista (List<Integer>lista) {

		System.out.println("***********MOSTRAT LISTA CON ITERATOR**********");

		Iterator iterator = lista.iterator(); 

		while(iterator.hasNext()) {

			System.out.println(iterator.next());
		}

		System.out.println("*************MOSTRAR CON FOR-EACH************");

		for(Integer cp : lista) {

			System.out.println(cp);
		}

		System.out.println("*************MOSTRAR CON FOR EN REVERSE*********");

		for(int i = lista.size()-1; i > 0; i--) {

			System.out.println(lista.get(i));
		}

	}


	//intercambiar posicion 2 por la 4

	public static void intercambio (List<Integer>lista) {

		//obtemos las posiciones para guardar los valores
		int pos2= lista.get(2); 
		int pos4= lista.get(4); 

		//Modificamos los valores
		lista.set(2, pos4);
		lista.set(4, pos2);


		//mostramos la lista 
		System.out.println(lista);

	}



	@Override
	public String toString() {
		return "Ejercicio3 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public static void main(String[] args) {


		Scanner terminal = new Scanner (System.in); 




		//creamos la listas dónde se introduciran los numeros

		ArrayList<Integer> listaNum = new ArrayList<Integer>();

		LinkedList<Integer> linkedNum = new LinkedList<Integer>(); 


		while(true) {

			System.out.println("Introduce un número en la lista (para salir -1 ): ");
			int numero = terminal.nextInt(); 
			Ejercicio3.addNumeros(listaNum, numero);


			if(numero == -1)break; 
		}


		Ejercicio3.mostrarLista(listaNum);

		System.out.println("**********INTERCAMBIO***********************");
		Ejercicio3.intercambio(listaNum);


		System.out.println("***********PROBAMOS CON LINKEDLIST**************");

		while(true) {

			System.out.println("Introduce un número en la lista (para salir -1 ): ");
			int numero = terminal.nextInt(); 
			Ejercicio3.addNumeros(linkedNum, numero);


			if(numero == -1)break; 
		}

		Ejercicio3.mostrarLista(listaNum);
		System.out.println("**********INTERCAMBIO***********************");
		Ejercicio3.intercambio(listaNum);




		System.out.println("FIN DEL PROGRAMA");



		terminal.close();



	}

}
