import java.util.*;
public class Ejercicio21 {

	public static void main(String[] args) {
		/*21. Realiza un programa que lea 11 cadenas de caracteres para mostrar
		finalmente la de mayor longitud.*/
		String [] cadenaLarga = new String[11];

		//cadena mas pequeña
		int contadorCaracteres = 0;
		String resultado = "";
		Scanner terminal = new Scanner(System.in);
		//creamos un ciclo for que nos pida 11 cadenas de caracteres
		for(int i = 0; i<cadenaLarga.length; i++) {
			System.out.println("Introduce una fase para la cadena numero "+(i+1));
			cadenaLarga[i]= terminal.nextLine();
			//la cadena x que tenga mayor longitud que contadorCaracteres (iniciado en 0)
			if(cadenaLarga[i].length() > contadorCaracteres) {
				// contadorCaracteres almacena la cadena[i] más larga, actualizandose en cada ciclo
				contadorCaracteres =cadenaLarga[i].length();
				//como el contador es un número y queremos que nos devuelva la cadena y NO su longitud
				// vamos a crear un String auxiliar que almacena la cadena más larga, y no su longitud como hacia el contadorCaracteres
				resultado = cadenaLarga[i];
			}
			
			/*NOTA: Si el ejercicio en vez pedir la de mayor logitud hubiera pedido la de menor
			 * longitud en este caso al contador le puedes dar el valor de MAX_VALUE*/

		}
		System.out.println("la cadena mas larga es "+resultado);
	}
}


