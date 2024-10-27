package EjemplosClase;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class EjemploMap2 {
	

	
	
	public static void  mostrarPosicion (HashMap<String, String> map ,int posicion){
		
	Iterator<String> it2 = map.keySet().iterator();
	int contador = 0;
	while(it2.hasNext()) {
		
		String key = it2.next();
		contador++; 
		
		
		if(posicion > map.size()) {
			System.out.println("posicion fuera de rango");
			break; 
		}
		else if (contador == posicion) {
			System.out.println("clave : "+ key + " valor = "+ map.get(key));
			break; 
		}

	}
	}

	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		
		//con map (NO USAMOS ADD; USAMOS PUT)
		
		hashmap.put("Madrid", "España");
		hashmap.put("Barcelona", "España");
		hashmap.put("Roma", "Italia");
		hashmap.put("Paris", "Francia"); 
		
		
		// MOSTRAR CONTENIDO
		
		System.out.println("MOSTRAR CONTENIDO");
		System.out.println(hashmap); //completo
		System.out.println(hashmap.entrySet());//completo
		System.out.println(hashmap.keySet());// sólo la llave
		System.out.println(hashmap.values());//solo valores
		
		System.out.println();
		
		// MOSTRAR CONTENIDO CON BUCLES
		
		System.out.println("******  ITERATOR *******");
		
		// String porque la clave es String y keySet porque es lo se va recorrer.
		Iterator<String> it = hashmap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("clave "+ key+ " = "+hashmap.get(key));
		}
		
		System.out.println();
		
		System.out.println("******** ITERADOR DESCENDENTE ************");
		
	
		
		
		System.out.println();
		System.out.println("CONTIENE ******************************");
		System.out.println();
		
		System.out.println("Numero de elementos = "+ hashmap.size());
		
		System.out.println("esta vacio= " +hashmap.isEmpty());
		
		System.out.println("contiene una llave 6 = " + hashmap.containsKey("Barcelona"));
		
		System.out.println("contiene una llave 6 = " + hashmap.containsValue(6));
		
		
		System.out.println("********* OBTENER POSICION ********************");
		System.out.println();
		
		System.out.println(" obetener valor de la clave Barcelona = "+ hashmap.get("Barcelona"));
		
		
		System.out.println();
		System.out.println("OBTENER EL VALOR DE UNA POSICION del MAP");
		mostrarPosicion(hashmap, 7);
		
		
		System.out.println();
		System.out.println("************* ELIMINAR ELEMENTOS **************");
		System.out.println();
		
		//eliminaremos todas las dos claves que son España.
		
		
		
		
	
		
		
		
				
		
			
			
		

	}

}
