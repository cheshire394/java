import java.util.*;
public class Ejercicio25 {
	
	/*El ejercicio no lo pedia, pero vamos a imaginar que tambien necesitamos
	 * saber si una letra de la cadena es mayuscula, ademas lo vamos hacer con POO*/
	public static boolean tieneMayus(String cadena) {
		//el each recorre cada char del parametro, y utilizamos un metodo para checkear
		for (char tieneMayus : cadena.toCharArray()) {
			//isUpperCase no convierte a mayus, sino verifica si es mayuscula
			if(Character.isUpperCase(tieneMayus)) {
				
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		/*25. Realiza un programa al que se le pasarán desde línea de comando una
		serie de cadenas. Mostrará por pantalla la cadena que esté íntegramente
		escrita en mayúsculas.*/
		
		String cadena; 
		String aux; 
		
		Scanner terminal = new Scanner (System.in);
		
		//metodo concadenas cadenas String
		StringBuilder mayusAcumuladas = new StringBuilder();
		StringBuilder algunaCharMayus = new StringBuilder();
		
		do {
			System.out.println("Introduce una cadena: ");
			cadena = terminal.nextLine();
			//creamos una nueva variable, que sea una copia de la cadena peor en mayus
			String cadenaMayus = cadena.toUpperCase();	
			// ahora comparamos las dos cadenas://retorna un true
			if(cadena.equals(cadenaMayus)) {
				/*QUEREMOS CREAR UN METODO QUE RECOJA TODAS LAS CADENAS MAYUS
				 */
				mayusAcumuladas.append(cadena).append(" ");
	
			}
		
			System.out.println("Desea introducir mas cadenas: ");
			aux = terminal.nextLine();
		}while(aux.equalsIgnoreCase("si")); //mientras cadena sea si, pide una nuva
		
		//imprimimos todas las mayusculas acumuladas
		System.out.println(mayusAcumuladas);
		System.out.println("FIN DE TODAS MAYUSCULAS");
		
		System.out.println("INICIO DE ALGUNA MAYUSCULA");
		//ES UN METODO POO
		do {
			System.out.println("Introduce una cadena: ");
			cadena = terminal.nextLine();
				Ejercicio25.tieneMayus(cadena);
			if(tieneMayus(cadena)) {
				//si tiene alguna mayuscula acumula en esta variable
				algunaCharMayus.append(cadena).append(" ");
			}
				
			
			System.out.println("Desea introducir mas cadenas: ");
			aux = terminal.nextLine();
		}while(aux.equalsIgnoreCase("si")); //mientras cadena sea si, pide una nuva
		System.out.println(algunaCharMayus);
		System.out.println("Fin");
		
	}

}
