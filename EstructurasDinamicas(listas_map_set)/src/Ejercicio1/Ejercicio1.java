package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ejercicio1 implements InterfazLista  {

	/*	Crea la interfaz Lista que define distintas operaciones con una lista de
	objetos:
	● putInicio: se le pasará un objeto genérico de la clase Object y lo
	añadirá al inicio de la lista. No devuelve nada.
	● putFinal: se le pasará un objeto genérico de la clase Object y lo
	añadirá al final de la lista. No devuelve nada.
	● popPrincipio: obtiene y elimina el primer objeto de la lista.
	Devuelve dicho objeto.
	● popFinal: obtiene y elimina el último elemento de la lista. Devuelve
	dicho elemento.
	● getAt: se le pasa como parámetro una posición y obtiene y elimina
	el elemento que ocupa dicha posición. Devuelve dicho elemento.
	● count: devuelve el número de objetos de la lista.
	Realiza una implementación de la interfaz anterior utilizando un ArrayList
	para almacenar los objetos.

	Los objetos que almacenarán contendrán dos atributos: dato1 que es un
	entero y dato2 que es un String. Implementa dicha clase con nombre
	Objeto.
	Finalmente, escribe una clase que contenga el método main para probar la
	implementación anterior */


	//atributos
	private int dato1; 
	private String  dato2;






	//constructor
	public Ejercicio1(int dato1, String dato2) {

		this.dato1 = dato1;
		this.dato2 = dato2;
	}




	public Ejercicio1(Object object) {
		// TODO Auto-generated constructor stub
	}




	//gette y setter
	public int getDato1() {
		return dato1;
	}

	public void setDato1(int dato1) {
		this.dato1 = dato1;
	}
	public String getDato2() {
		return dato2;
	}
	public void setDato2(String dato2) {
		this.dato2 = dato2;
	}

	//REALIZA OPERACIONES


	//putInicio: se le pasará un objeto genérico de la clase Object y lo añadirá al inicio de la lista. No devuelve nada.

	public void putInicio (ArrayList<Object> lista) {
		lista.add(0, this);

	}



	//● putFinal: se le pasará un objeto genérico de la clase Object y lo añadirá al final de la lista. No devuelve nada.

	public void putFinal (ArrayList<Object> lista) {

		lista.add(this); 
	}



	//MOSTRAMOS LA LISTA
	public static void mostrarLista (ArrayList<Object> lista) {


		System.out.println("************ USANDO ITERATOR *************************");

		Iterator<Object> iterator =  lista.iterator();

		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("**************USANDO FOR-EACH***************************");

		for(Object cp : lista) {
			System.out.println(cp);
		}

		System.out.println("**************USANDO FOR  ***************************");

		for(int i = 0; i < lista.size();i++) {
			System.out.println(lista.get(i));
		}


	}


	//● popPrincipio: obtiene y elimina el primer objeto de la lista. Devuelve dicho objeto.

	public static Ejercicio1 popPrincipio(ArrayList<Object>lista) {

		//creamos un objeto vacio, que recoja el valor del elemento 0 de la lista
		Ejercicio1 objAux = new Ejercicio1(lista.get(0)); 

		lista.remove(0); //eliminamos el objeto de la lista

		return objAux; 

	}




	//● popFinal: obtiene y elimina el último elemento de la lista. Devuelve dicho elemento.
	//para eliminar el ultimo elemento, es necesario 

	public static Ejercicio1 popFinal (ArrayList<Object>lista) {

		//creamos un objeto que recoja el último elemento de la lista
		Ejercicio1 objAux= new Ejercicio1(lista.get(lista.size()-1)); 

		lista.remove(lista.size()-1);
		return objAux; 


	}



	//● getAt: se le pasa como parámetro una posición y obtiene y elimina
	//el elemento que ocupa dicha posición. Devuelve dicho elemento.


	public static Ejercicio1 getAt (ArrayList<Object>lista, int posicion) {


		if(posicion > lista.size()) {
			System.out.println("Posición fuera de rango");

		}


		//creamos un objeto que recoja el último elemento de la lista
		Ejercicio1 objAux= new Ejercicio1(lista.get(posicion)); 

		lista.remove(posicion);
		return objAux; 


	}





	//● count: devuelve el número de objetos de la lista.

	public static int count(ArrayList<Object>lista) {

		int contador = 0; 

		System.out.println("*************CONTADOR CON FOR-EACH************");

		for(Object cp : lista) {
			contador++; 
		}
		//return contador; 

		System.out.println("************CONTADOR ITERATOR****************");
		Iterator iterator = lista.iterator();

		while (iterator.hasNext()) {

			iterator.next();
			contador++;
		}

		//return contador;


		System.out.println("***********CONTADOR FOR**********************");

		for (int i = 0; i < lista.size();i++) {
			contador++; 

		}
		//opción mucho más sencilla, si necesidad de iterar la lista
		System.out.println("contador: "+lista.size());
		return contador; 
	}


	
	//MOSTRAR LISTA EN ORDEN DESCENDENTE:
	public static void mostrarReverse(ArrayList<Object>lista) {
		System.out.println("*********REVERSE FOR*******************");
		for(int i = lista.size()-1; i > 0; i--) {
			System.out.println(lista.get(i));
		}
		System.out.println("**********REVERSE ITERATOR DESCENDING SOLO ES DE LINKEDLIST*************");
		System.out.println("***********REVERSE ITERATOR PREVIOUS ****************");
		
		ListIterator<Object> iterator = lista.listIterator(lista.size()); //empezamos por el final
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}}
		
		
		
		
	


	@Override
	public String toString() {
		return "Ejercicio1 [dato1=" + dato1 + ", dato2=" + dato2 +  "]";
	}




	public static void main (String []args) {

		//creamos objeto 
		Ejercicio1 objeto1 = new Ejercicio1(1,"A"); 
		Ejercicio1 objeto2 = new Ejercicio1(2,"B"); 
		Ejercicio1 objeto3 = new Ejercicio1(3,"C"); 
		Ejercicio1 objeto4 = new Ejercicio1(4,"D"); 
		Ejercicio1 objeto5 = new Ejercicio1(5,"E"); 
		Ejercicio1 objeto6 = new Ejercicio1(6,"F");

		ArrayList<Object> lista = new ArrayList<Object>();


		//añadirmos el objeto 6 al inicio
		objeto1.putInicio(lista);
		objeto6.putInicio(lista);


		//añadimos el resto de objetos al final
		objeto2.putFinal(lista);
		objeto3.putFinal(lista);
		objeto4.putFinal(lista);
		objeto5.putFinal(lista);

		Ejercicio1.mostrarLista(lista);


		System.out.println("***********CONTADOR DE ELEMENTOS********************");
		System.out.println(Ejercicio1.count(lista));
		//devuelve el triple, porque has usado, iterator, for y for-each en un mismo metodo


		System.out.println("************MOSTRAR LA LISTA EN DESCENDENCIA**************");
		
		Ejercicio1.mostrarReverse(lista);

		

		System.out.println("*****************ELIMINAMOS ELEMENTOS*******************");
		//eliminamos el primer elemento
		Ejercicio1.getAt(lista, 1); 
		Ejercicio1.popPrincipio(lista);
		Ejercicio1.popFinal(lista); 

		Ejercicio1.mostrarLista(lista);











	}






}
