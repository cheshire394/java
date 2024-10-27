import java.text.spi.DateFormatSymbolsProvider;

import java.util.*;
public class Ejercicio22 {



	public static String[] insertarNombres(Scanner terminal) {

		//Scanner sc = new Scanner(System.in); 

		String [] nombres = new String[5]; 

		String nombreActual; 
		int posicion  = 0; 



		System.out.println("Escribe el primer nombre");
		nombres[0]= terminal.nextLine(); 
		
		for(int i = 0; i < nombres.length; i++) {
			
			System.out.println("Introduce un nombre para la posicion i "+i);
			
			nombres[i]= terminal.nextLine();
			
			if(nombres[i].isEmpty())nombres[i]= null; 
			

			for(int j = 0 ; j < i ; j++) {
				
				if(nombres[i].equalsIgnoreCase(nombres[j])) {
					
					do {
						System.out.println("Nombre repetido detectado, introduce un nombre para posicion "+i);
						nombres[i]= terminal.nextLine();
						
					}while(nombres[i].equalsIgnoreCase(nombres[j]));
		
				}
				
			}
		}

			System.out.println(Arrays.toString(nombres));
			return nombres; 

	}
	
	
	
	
public static void eliminaVector(String [] vector) {
		
		for(int i = 0; i < vector.length; i++) {
			
			vector[i]= null; 
		}
		
	}





	public static void mostrarVector (String [] vector) {


		System.out.println(Arrays.toString(vector));
	}



	public static void main(String[] args) {
		/* Realiza un programa que permita crear un menu. que contenga un máximo 
		 * de 5 nombres, y permita introducirlos, mostrarlos, eliminar algun nombre, o eliminarlos a todos y salir del programa*/


		Scanner leer = new Scanner (System.in);

	
		/*ystem.out.println("2.Listar nombre");
		System.out.println("3.Eliminar nombre");
		System.out.println("4.<Eliminar todos los nombres");
		System.out.println("5.Salir");*/

		final int FINAL_ARRAY = 5;

		String [] arrayNombres= new String [FINAL_ARRAY];






		System.out.println("SI DESEA NO INTRODUCIR MAS NOMBRES, PULSA UN INTRO VACIO ");
		for (int i = 0; i < arrayNombres.length; i++) {
			System.out.println("1.Intoducir nombre para la posicion "+(i+1));
			arrayNombres[i] = leer.nextLine();

			//comprobamos que ningun nombre está repetido
			for(int j = 0; j < i; j++) {
				if(arrayNombres[i].equalsIgnoreCase(arrayNombres[j]) ) {
					do {
						System.out.println("nombre repetido detectado");
						System.out.println("1.Intoducir nombre para la posicion "+(i+1));
						arrayNombres[i] = leer.nextLine();
						leer.nextLine();

					}while(arrayNombres[i].equalsIgnoreCase(arrayNombres[j]));
				}
			}

			//is.Empty es un metodo booleano, que es true, si el String no contiene ningun caracter,
			//es decir es capaza de detectar si una variable tiene caracter o no, y si retorna true, entra en el if
			//y rompe el bucle.
			if(arrayNombres[i].isEmpty()) {
				arrayNombres[i] = null; //damos a esa variable con espacio, el valor de null
				break;
			}

		}

		System.out.println("DESEA IMPRIMIR EL LISTADO DE NOMBRES: pulse si o no ");
		String  imprimir;
		imprimir = leer.nextLine();
		leer.nextLine();//limpia el intro
		if(imprimir.equalsIgnoreCase("si")) {
			System.out.println(Arrays.toString(arrayNombres));
		}


		System.out.println("DESEA ELIMINAR ALGUN NOMBRE DE LA LISTA: pulse si o no");
		imprimir = leer.nextLine();


		while(imprimir.equalsIgnoreCase("si")) {
			System.out.println("¿qué nombre deseas eliminar de la lista?: ");
			imprimir = leer.nextLine();
			boolean encontrado = false;
			for(int i= 0; i < arrayNombres.length; i++) {
				if(imprimir.equalsIgnoreCase(arrayNombres[i])) {
					encontrado = true;//evitamos que diga que no lo ha encontrado
					arrayNombres[i] = null;

				}
			}
			//solo se imprime si no ha entrado en el primer if
			if(!encontrado) {
				System.out.println("el nombre "+imprimir+ " no está en el array");
			}

			//si encontrado es false, es porque no está en la lisra
			System.out.println("¿quieres eliminar mas nombres? pulsa si ");
			imprimir = leer.nextLine();

			//si no quire eliminar más nombres salimos del while
			if(!imprimir.equalsIgnoreCase("si")) {
				break;
			}

		}

		System.out.println("desea eliminar TODOS LOS NOMBRES: pulse si");
		imprimir = leer.nextLine();
		if(imprimir.equalsIgnoreCase("si")) {
			//CREAMOS UN NUEVO ARRAY SIN NOMBRES
			String [] arrayVacio = new String[FINAL_ARRAY];
			//y al array anterior le damos ese valor.
			arrayNombres = arrayVacio;
		}


		System.out.println("FIN DEL PROGRAMA: LA lista es la siguiente: ");
		//imprimimos array
		System.out.println(Arrays.toString(arrayNombres));





	}

}
