
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Ejercicio40 {
	//caracteristicas ISBN tiene 13 digitos y empieza con 978 o 979

		//es {10} porque le tienes que restar los tres números iniciales
		public static final String PATRON_ISBN = "(978|979)[0-9]{10}";
		
		
		public static boolean isValido(Scanner terminal) {
			System.out.println("Introduce una cuenta twitter: ");
			String twitter = terminal.nextLine();
			
			Pattern pattern = Pattern.compile(PATRON_ISBN);
			Matcher matcher = pattern.matcher(twitter);
			
			if(matcher.matches()) System.out.println("es una cuenta valida");
			else System.out.println("No es válida");
			return matcher.matches();
		}
		
		public static void main(String[] args) {
		/*40. Realiza un método que valide si el parámetro que se le pasa es un ISBN
		válido: 13 digitos y siempre empieza en 978 o 979.*/

			Scanner terminal = new Scanner (System.in);
			
			String aux;
			
			while(true) {
				Ejercicio39.isValido(terminal);
				System.out.println("¿quieres introducir más binarios?");
				aux = terminal.nextLine();
				
				//si el usuario no introduce si, salimos del program
				if(!aux.equalsIgnoreCase("si"))break;
				}
				
				System.out.println("Fin");
				terminal.close();
			}
			
		}


