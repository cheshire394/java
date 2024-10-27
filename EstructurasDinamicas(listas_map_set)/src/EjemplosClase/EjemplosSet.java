package EjemplosClase;
import java.util.HashSet;
import java.util.Iterator; 
public class EjemplosSet {

	public static void main(String[] args) {
	
		HashSet<String> setNombres = new HashSet<String>(); 

		
		//HashSet por definición no se pueden repetir(no existir nombres duplicados) y el orden NO IMPORTA.
		
		
		//añadirmos tres nombres al set
		
		setNombres.add("Alumno1"); 
		
		setNombres.add("Alumno2"); 
		
		setNombres.add("Alumno3"); 
		
		//No da error en caso de duplicado, pero ignora el último elemento introducido que sea duplicado. 
		setNombres.add("Alumno2"); 
		
		
		//imprimimos la lista
		System.out.println(setNombres);
		
		//imprimir con for-each
		for (String cp : setNombres) {
			//Si el elemento cumple esta condicon IF else; lo imprimes
			System.out.println(setNombres);
		}

		//ejemplo con iteretor
		Iterator it = setNombres.iterator();
		
		//PASA AL SIGUIENTE ELEMENTO
		while (it.hasNext()) {
			System.out.println("--> "+ it.next());
		}
		
		//contienes un elemento
		System.out.println(setNombres.contains("Alumno1"));
		
		boolean obtener = setNombres.contains("Alumno1"); 
		System.out.println(obtener);
	}

}
