import java.util.*;
import java.util.regex.*;
public class Ejercicio37 {

	private static final String PATRON_MATRICULA= "^\\d{4}[A-Z]{3}$";

	//creamos un metodo de validacion
	public static boolean validarMatricula (Scanner terminal) {
		System.out.println("Introduce una matricula: ");
		//terminal.nextLine();	hacia que el metodo siempre entre else
		String matricula = terminal.nextLine();

		Pattern pattern = Pattern.compile(PATRON_MATRICULA);
		//Utilizamos la variable pattern creada para hacer matcher
		Matcher matcher = pattern.matcher(matricula);

		//devolvemos resultado en el metodo: 
		if(matcher.matches())System.out.println("matrícula válida");
		else System.out.println("matricula No válida");

		return matcher.matches();//retona el boolean
	}


	public static void main(String[] args) {
		/*/*37. Realiza un método que haciendo uso de una expresión regular, valide
		que el parámetro que se le pasa (será un String) es una matrícula de
		coche válida en formato 0000XXX.*/



		Scanner terminal = new Scanner(System.in);
		String aux; 

		while(true) {
			//comprobamos validacion en main
			//El sistema esta diseñado para introducir matricula por teclado
			Ejercicio37.validarMatricula(terminal);

			System.out.println("Quieres introducir más matriculas: ");
			aux= terminal.nextLine();
			
			//Si el usuario NO afirma entonces detenemos el ciclo
			if(!aux.equalsIgnoreCase("si")) break; 
				
		}
		System.out.println("FIN del programa");

		terminal.close();

	}

}
