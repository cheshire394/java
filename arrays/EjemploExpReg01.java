import java.util.regex.Pattern;

public class EjemploExpReg01 {

	public static void main(String[] args) {
				
		//  TIPOS DE PATRONES FECHA
		String patron = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
		
		/*Cambios realizados:
		Reemplacé [0-9] con \\d para representar cualquier dígito.
		Eliminé los espacios en blanco alrededor de las barras inclinadas en el patrón.*/
		
		String patron2 = "\\d{1,2}/\\d{1,2}/\\d{4}";
		
		//ejemplos
		String cadena = "08/01/2024";//es true
		String cadena2 = "08-01-2024"; //es false
		
		System.out.println(Pattern.matches(patron, cadena));
		
		System.out.println(Pattern.matches(patron, cadena2));
		
		System.out.println(Pattern.matches(patron2, cadena));
		
		System.out.println(Pattern.matches(patron2, cadena2));


	}

}
