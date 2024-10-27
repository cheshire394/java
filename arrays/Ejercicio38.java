import java.util.*;
import java.util.regex.*;

public class Ejercicio38 {
									
		private static final String PATRON_BINARY = "^[0-1]+$";//+ es 1 o más...
		
		
		//metodo que valida si el patron introducido es correcto
		public static final boolean isBinary (Scanner terminal) {
			System.out.println("Introduce un numero Binario: ");
			String binario = terminal.nextLine();
			
			Pattern pattern = Pattern.compile(PATRON_BINARY);
			Matcher matcher = pattern.matcher(binario);
			
			if(matcher.matches()) System.out.println("EL numero "+binario+ " es binario");
			else System.out.println("EL numero "+binario+ " NO es binario");
			return matcher.matches();	
		
		}
		
		
	public static void main(String[] args) {
		/*
		38. Realiza un método que haciendo uso de una expresión regular, valide
		que el parámetro que se le pasa (será un String) es un número binario.*/
		Scanner terminal = new Scanner (System.in);
		
		String aux;
		
		while(true) {
		Ejercicio38.isBinary(terminal);
		System.out.println("¿quieres introducir más binarios?");
		aux = terminal.nextLine();
		
		//si el usuario no introduce si, salimos del program
		if(!aux.equalsIgnoreCase("si"))break;
		}
		
		System.out.println("Fin");
		terminal.close();
	}

}
