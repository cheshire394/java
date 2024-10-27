import java.util.*;
public class Ejercicio23 {

	public static void main(String[] args) {
		/*23. Realiza un programa que lea dos cadenas de caracteres. Se mostrarán
		entrelazadas, empezando por la primera.*/
		
		String cadena1, cadena2, restoCadena; //resto calculará las letras que sobran de la cadena mas larga
		String pregunta;//¿desea terminar el programa?.
		
		
		
		Scanner terminal = new Scanner (System.in);
		
		//creamos un do-while, para entrelazar cadenas hasta que el usuario quiera.
		do {
		System.out.println("Introduce la cadena: ");
		cadena1 = terminal.nextLine();
		System.out.println("Introduce la cadena: ");
		cadena2 = terminal.nextLine();
		
		
		//El length de la cadena va a ser el que tenga la longitud minima
		//utilizamos un método MATH.MIN para ello, solo permite comparar dos valores
		//pero si no son muchos puedes utilizar el nombre de esta variable
		//y meterla a su vez en otro Math.min, para comparar tres valores.
		//Si son más de tres valores entonces hacerlo con un doble for. 
		int longitudMinima = Math.min(cadena1.length(), cadena2.length());//devuelve el lenght mas corto
	
	
		
		//creamos un ciclo for que entralace las dos frases hasta la longitud minima (length corto)
		
		for(int i = 0; i < longitudMinima; i++) {
			System.out.print(cadena1.charAt(i));
			System.out.print(cadena2.charAt(i));
			
		}
		//calculamos la longitud máxima, para sacar el subString que necesitamos.
		int longitudMaxima = Math.max(cadena1.length(), cadena2.length());
		
		//si logitud maxima es la primera cadena, le sacamos a esta el subString
		if(cadena1.length() == longitudMaxima) {
			restoCadena = cadena1.substring(longitudMinima, longitudMaxima);
			System.out.print(restoCadena);
		}
		else {//si es la segunda cadena, entonces el subString lo hacemos en la cadena dos.
			restoCadena = cadena2.substring(longitudMinima, longitudMaxima);
			System.out.print(restoCadena);
		}
		System.out.println();
		System.out.println("¿Deseas entrelazar  más palabras? pulse si: ");
		pregunta = terminal.nextLine();
		}while(pregunta.equalsIgnoreCase("si"));
		
		System.out.println("FIN DEL PROGRAMA");
		
		

		terminal.close();
	}
}
