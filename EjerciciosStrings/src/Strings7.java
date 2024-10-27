
public class Strings7 {

	public static void main(String[] args) {
		/* Transforma la cadena de texto “Hola Mundo” a mayúsculas. Guarda el valor en la
			variable y posteriormente conviértela nuevamente a minúsculas.*/
		
		String cambiar_tamaño = "Hola mundo";
		String mayusculas = cambiar_tamaño.toUpperCase();
		System.out.println(mayusculas);
		String minusculas = mayusculas.toLowerCase();
		System.out.println(minusculas);

	}

}
