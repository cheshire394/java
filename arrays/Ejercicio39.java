import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio39 {

	public static final String PATRON_TWIITER = "^(\\@\\W\\w\\_\\-){1,15}";
	// "^[@][A-Za-z0-9-_]{1,15}$" --> correccion de Nacho
	
	public static boolean isValido(Scanner terminal) {
		System.out.println("Introduce una cuenta twitter: ");
		String twitter = terminal.nextLine();
		
		Pattern pattern = Pattern.compile(PATRON_TWIITER);
		Matcher matcher = pattern.matcher(twitter);
		
		if(matcher.matches()) System.out.println("es una cuenta valida");
		else System.out.println("No es válida");
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		/*39. Realiza un método que valide si el parámetro que se le pasa es un
		nombre de usuario válido en twitter: empieza por @ y puede contener
		letras mayusculas y minusculas, numeros, guiones y guiones bajos y la
		longitud es entre 1 y 15 caracteres.*/

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


