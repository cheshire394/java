package Ejercicio13;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colores {







	/*● Crea un TreeMap con los colores: Red, Green, Black, White y Blue
	como valor. La clave será C1, C2, etc.
	● Muestra los valores del TreeMap junto con su clave (uno en cada
	línea).
	● Indica al usuario si el TreeMap contiene el color Green. Ídem con el
	color Pink.

	● Almacena las claves del TreeMap en una colección Set (revisa la
	API). Imprímelas, cada una en una línea.

	● Modifica las claves del TreeMap, de forma que ahora Red->C4,
	Green->C3, Black->C2, White->C1, Blue->C5. No se tiene que
	modificar el orden de inserción, únicamente las claves. Muestra el
	contenido del TreeMap (en una sola línea). ¿En qué orden aparece?
	¿Por qué?
	
	
	● Muestra la clave y su valor asociado de los elementos que ocupan la
	primera y última posición en el TreeMap (revisa la API).
	
	
	● Muestra sólo la clave que ocupa la primera y última posición en el
	TreeMap (revisa la API).
	
	
	● Muestra los elementos del TreeMap en orden inverso (revisa la API).
	
	
	● Elimina y muestra el primer elemento del TreeMap (revisa la API).
	● Ídem con el último elemento.*/



	public static void mostrarColores (TreeMap<String, String> map) {

		System.out.println("*********** CON ITERATOR **********");

		Iterator<String> it = map.keySet().iterator();

		while(it.hasNext()) {

			String clave = (String) it.next(); 

			System.out.println("La clave = "+clave+" ---> valor = "+ map.get(clave));

		}

		System.out.println("*********** CON FOR - EACH *******");

		for(Entry<String, String> cp : map.entrySet()) {

			String clave = cp.getKey();
			String valor = cp.getValue();
			System.out.println("La clave = "+clave+" ---> valor = "+ valor);


		}

	}





	public static boolean contiene (Map<String, String> map, String valor) {
		System.out.println();

		boolean existe = false; 

		if(map.containsValue(valor)) existe = true;



		System.out.print("¿El map introducido contiene el valor "+ valor+ "? ");
		return existe; 
	}


	public static void almacenarClaves (Map<String, String> map, Set<String>set) {
		//como solo quiere las claves no es necesario usa entry
		for(String cp : map.keySet()) {
			set.add(cp);}

		
		System.out.println();
		System.out.println("*********Almacen de claves del map con un SET (sin entry): ***************");
		System.out.println(set);
		
		
		//si NO TE ACUERDAS CON ENTRY
		for(Entry<String, String> cp : map.entrySet()) {
			
			String claves = cp.getKey();
			
			set.add(claves);
			
		}
		System.out.println();
		System.out.println("******** usando entry ****************");
		System.out.println(set);

	}
	
	public static void invertirClaveValor(Map <String, String> map1, Map <String, String> map2) {
		
		for(Entry<String, String> cp : map1.entrySet()) {
			
			String clave = cp.getKey();
			String valor = cp.getValue();
			
			map2.put(valor, clave); 
			
		}
		System.out.println();
		System.out.println("Mapa dos invertido **************");
		System.out.println(map2);
		
		
	}
	





	public static void main(String[] args) {

		TreeMap<String, String> colores = new TreeMap<>();

		// Agregar elementos al TreeMap
		colores.put("C1", "Red");
		colores.put("C2", "Green");
		colores.put("C3", "Black");
		colores.put("C4", "White");
		colores.put("C5", "Blue");

		mostrarColores(colores);

		System.out.println( contiene(colores, "Pink"));

		TreeSet<String> set = new TreeSet<>(); 



		almacenarClaves(colores, set);


		// Almacenar las claves en con la API
		
		System.out.println();
		System.out.println("Usando la API de java, mas eficiente ");
		Set<String> keys = colores.keySet();
		
		System.out.println(keys);
		
		
		TreeMap<String, String> mapInvertir = new TreeMap<>(); 
		
		invertirClaveValor(colores, mapInvertir);
		
		System.out.println();
		System.out.println("Primera posición de un TreeMap");
		
		 Entry<String, String> firstEntry = colores.firstEntry();
		 System.out.println(firstEntry);
		 
		 String firstKey  =colores.firstKey();
		 System.out.println(firstKey);
		 
		 String firstValue = colores.get(firstKey); 
		 System.out.println(firstValue);
		 
		 System.out.println();
		 System.out.println("Ultima Posición de un TreeMap");
		 Entry<String, String> lastEntry = colores.lastEntry();
		 System.out.println("(con entry hay que castear --> lastEntry= "+lastEntry);
		 String lastKey = colores.lastKey();
		 System.out.println(lastKey);
		 String lastValue = colores.get(lastKey); 
		 System.out.println(lastValue);
		 
		 
		
		 
		 
		 System.out.println();
		 System.out.println("*********Elementos en orden Inverso*****************");
		 
		 NavigableMap<String, String> coloresInversoMap = colores.descendingMap();
		 System.out.println(coloresInversoMap);
		 
		 NavigableSet<String> coloresInversoKey = colores.descendingKeySet();
		 System.out.println(coloresInversoKey);
		
		 System.out.println("Y pued hacer los mismo con TreeSet....");
		 NavigableSet<String> setInverso = set.descendingSet();
		 System.out.println(setInverso);
		 
		 System.out.println();
		 System.out.println("*******ELiminar los últimos elementos************");
		 colores.pollFirstEntry();
		 colores.pollLastEntry();
		 System.out.println(colores);
		 
		 System.out.println();

		

		 
		
		 

		
		

	}
}
