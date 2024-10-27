package Ejercicio9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Jugadores {
	
	/*Crea un conjunto (HashSet) al que se le va a llamar jugadores. Implementa
	los siguientes métodos:
	● Inserta en el conjunto los jugadores del FC Barcelona: Jordi Alba,
	Pique, Busquets, Iniesta, Messi.
	● Realiza un bucle sobre los jugadores del conjunto y muestra sus
	nombres.
	● Consulta si en el conjunto existe el jugador “Neymar JR”. Avisa si
	existe o no.
	● Crea un segundo conjunto jugadores2 con los jugadores “Piqué” y
	“Busquets”.
	
	● Consulta si todos los elementos de jugadores2 existen en jugadores.
	
	● Realiza una unión de los conjuntos jugadores y jugadores2 y observa
	el resultado.
	
	● Elimina todos los jugadores del conjunto jugadores2 y muestra el
	número de jugadores que tiene el conjunto jugadores2 (debería
	ahora ser cero).*/

	
	public static void mostrar (Set<String> set) {
		System.out.println("************* MOSTRAR SET CON ITERATOR************");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**************MOSTRAR SET CON FOR EACH************");
		for(String cp : set) {
			System.out.println(cp);
		}
		System.out.println("*********** MOSTRAR SET CON FOR********************");
		System.out.println("recuerda que set, para mostrar con for es necesario convertir");
		ArrayList<String> lista = new ArrayList<String>(set); 
		
		for(int i = 0; i < set.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	
	
	public static void mostrarReverse (Set<String> set) {
		System.out.println("************* MOSTRAR SET REVERTIDO CON ITERATOR************");
		System.out.println("Recuerda que es necesario convertir a TreeSet");
		TreeSet<String> tree = new TreeSet<String>(set);
		
		Iterator<String> it = tree.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println("*********** MOSTRAR REVERTIDO SET CON FOR********************");
		System.out.println("recuerda que set, para mostrar con for es necesario convertir a lIST O Tree");
		ArrayList<String> lista = new ArrayList<String>(set); 
		
		for(int i = set.size()-1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
		System.out.println("SI USAS LISTA MOSTRAR EL ORDEN DE POSICIÓN, SI USAS TREE MOSTRARÁ EL ORDEN"
				+ " BAJO CRITERIO ALFÁBETICO");
	}
	
	//existe un jugador en la lista
	public static boolean exists (Set<String> set, String jugador) {
		boolean existe = set.contains(jugador); 
		System.out.print("Existe el jugador "+jugador+": ");
		return existe; 
	}
	
	

	//● quedate con un unico set que contenga solo los elementos en comun.
	
	public static Set<String> elementosComunes(Set<String> set1, Set<String>set2){
		
		//CREAMOS LA COPIA PORQUE retainAll va a eliminar elementos en el original 
		HashSet<String> union = new HashSet<String>(set1);
		
		//ahora el hashSet union contiene todos los elementos en común
		union.retainAll(set2);
		return union; 			
	}
	
	
	//eliminar todos los elementos de un set
	public static void eliminarTodosElementos (Set<String>set) {
		int contadorPrueba = 0; 
		
		for(String cp : set) {
			contadorPrueba++; 
		}
		
		//imprimimos y contamos los elementos 
		System.out.println(set);
		System.out.print("Elementos antes de eliminar la lista: ");
		System.out.println(contadorPrueba);
		
		set.clear(); //eliminamos la lista con clear PARTE VERDADERAMENTE EFECTIVA.
		
		 contadorPrueba = 0; //actualizamos el contador
		for(String cp : set) {
			contadorPrueba++; 
		}
		
		System.out.println(set);
		System.out.print("Elementos después de eliminar la lista: ");
		System.out.println(contadorPrueba);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		HashSet<String> jugadores = new HashSet<String>();
		
		jugadores.add("Jordi Alba");
        jugadores.add("Pique");
        jugadores.add("Busquets");
        jugadores.add("Iniesta");
        jugadores.add("Messi");

        HashSet<String> jugadores2 = new HashSet<>();
        jugadores2.add("Pique");
        jugadores2.add("Busquets");
        jugadores2.add("Cristiano Ronaldo");
        
        
		mostrar(jugadores); 
		mostrarReverse(jugadores);
		
		System.out.println(exists(jugadores, "Neymar JR"));
		
		//● Consulta si todos los elementos de jugadores2 existen en jugadores.
		
		boolean contiene = jugadores.containsAll(jugadores2);
		
		if (contiene)System.out.println("jugadores2 contiene los mismos elementos que jugadores");
		else System.out.println("Los dos set no contienen los mismo elementos");
		
		System.out.println();
		
		System.out.println("Recogemos los elementos que tienen en comun los dos set");
		System.out.println(Jugadores.elementosComunes(jugadores2, jugadores));
		
		System.out.println();
		
		//recuerda que si queremos unir listas primero debemos de elminar los elementos en comun
		//con removeAll;
		System.out.println("Unimos dos set");
		jugadores.addAll(jugadores2);
		System.out.println(jugadores);
		
		System.out.println();
		

		eliminarTodosElementos(jugadores2);
		
		
		
		
	
	
	}

}
