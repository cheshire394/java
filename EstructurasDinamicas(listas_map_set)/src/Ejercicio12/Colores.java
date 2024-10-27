package Ejercicio12;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colores {

	
	/*Escribe un programa que utilizando una colección HashMap:
● Almacene los siguientes colores: Red, Green, Black, White y Blue. La
clave será un entero, de tal forma que, Red->1, Green-> 2, etc.

● Muestra la clave y su valor asociado (cada uno en una línea).

● Muestra el total de colores almacenados en el HashMap.

● Crea otro HashMap con los siguientes colores: Pink, Orange, Purple
y claves 6, 7 y 8, respectivamente. Copia todos los valores de este
HashMap en el primero (revisa la API). Muestra la información que
contiene ahora el primer HashMap (toda en la misma línea).


● Elimina todos los elementos del segundo HashMap (utilizando un
único método). Imprime su contenido.


● Crea un tercer HashMap igual que el primero, pero con los valores
invertidos, es decir, ahora la clave será el color y el valor la posición.
Comprueba si existe el color Green dentro de este HashMap y
muestra un mensaje al usuario informándole en qué posición se
encuentra. Idem para el color Brown.


● Comprueba ahora si el valor Green existe en el primer HashMap.
Idem con el color Brown. Informa al usuario.*/
	
	
	
	
	public static void  mostrarColores (Map<Integer, String> map) {
		
		System.out.println("***********MOSTRAR CON ITERATOR************");
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer clave = (Integer) it.next();
			
			System.out.println("clave = "+clave+ "-->  Valor= "+map.get(clave));
		}
		
		System.out.println();
		
		System.out.println("*********** MOSTRAR CON FOR-EACH************");
		
		for(Entry<Integer, String> cp : map.entrySet()) {
			
			Integer clave = cp.getKey();
			String valor = cp.getValue();
			
			System.out.println("clave = "+clave+ "-->  Valor= "+valor);
			
		}
		
	}
	
	//ESTE METODO ES JODIDISIMO DE SACAR
	public static void mostrarDescendente(Map<Integer, String> map) {
	    System.out.println("mostar descendente Map ");
	    TreeMap<Integer, String> treeMap = new TreeMap<>(java.util.Collections.reverseOrder());
	    treeMap.putAll(map);
	    Iterator<Entry<Integer, String>> it = treeMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Entry<Integer, String> entry = it.next();
	        System.out.println(" La clave " + entry.getKey() + "  -->  valor = " + entry.getValue());}}
	    
	
	public static void unirMaps (Map<Integer, String>map1, Map<Integer, String>map2) {
		System.out.println();
		System.out.println("Unión de los maps");
		map1.putAll(map2);
		System.out.println(map1);
	}
	
	public static void eliminarTodo (Map<Integer,String> map) {
		
		System.out.println();
		System.out.println(map);
		System.out.println("Cantidad de elementos previos la eliminación "+map.size());
		
		map.clear(); //elimna en una sola linea.
		System.out.println("Cantidad de elementos tras la eliminación "+map.size());
		
	}
	
	public static int contiene (Map<String, Integer> map, String clave) {
		boolean contiene = map.containsKey(clave);
		System.out.println("¿EL mapa contiene la clave? -->  "+contiene);
		//si la contiene entonces iterar
		if(contiene) {	
		int posicion = 0; 
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			 String key= it.next();
			posicion++; 
			if(key.equals(clave)) {
				System.out.print("Posición --> ");
					return posicion;}}}
		return -1;}
		
	

	
		
   
	
	public static void main(String[] args) {
	
		
		
		HashMap<Integer, String> colores = new HashMap<Integer, String>();
		
		colores.put(1, "Red"); 
		colores.put(7, "Blue"); //observamos que iterator los ordena por su clave(sin hacer nada)
		colores.put(2, "Green");
		colores.put(3, "Black");
		colores.put(4, "white");
		colores.put(5, "Blue");
		colores.put(6, "Blue"); //no admite claves duplicadas, pero si valores
		
		
		mostrarColores(colores);
		mostrarDescendente(colores);
		System.out.println();
		
		//mostrar la cantidad de colores almacenados
		int cantidad = colores.size();
		System.out.println("La cantidad de colores almacenados es "+ cantidad);
		
		
		HashMap<Integer, String> colores2 = new HashMap<Integer, String>();
		
		colores2.put(8, "Purple");
		colores2.put(9, "Pink");
		colores2.put(10, "Orange");
		
		
		unirMaps(colores, colores2);
		
		eliminarTodo(colores2); 
		
		
		System.out.println();
		System.out.println("************* INVERTIR CLAVE - VALOR ************");
		
		HashMap<String, Integer> colores3 = new HashMap<String, Integer>();
		for(Entry<Integer, String> cp : colores.entrySet()) {
			
			Integer clave = cp.getKey();
			String valor = cp.getValue();
			
			colores3.put(valor, clave);
			
		}
		
		System.out.println(colores3);
		
		
		
	//metodo que si contiene la posición te dice donde.	
	System.out.println(	contiene(colores3,"Orange"));
	System.out.println(contiene(colores3, "Brown"));
	
	
		
		
		
		
	
		
	}

}
