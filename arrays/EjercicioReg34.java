import java.util.*;
import java.util.regex.Pattern;
public class EjercicioReg34 {

	public static void main(String[] args) {
		/*34.Realiza un método que haciendo uso de una expresión regular, valide
		que el parámetro que se le pasa (será un String) es un número entero
		positivo.*/
			
	//35. Idem al anterior pero validando si es un número entero negativo.

	String patronNum = "\\d+"; //otra opcion--> "[0-9]"
	String patronNumNeg = "^-\\d+$";
	//   ^ Coincide con el inicio de la cadena.
	//  - Coincide con el signo negativo.
	//  \\d+: Coincide con uno o más dígitos.
	//   $ Coincide con el final de la cadena.
	/*$ garantiza que no haya caracteres adicionales después del último dígito,
	 *  lo que significa que la cadena debe terminar después del número entero. */
	
	String num; 
	
	
	Scanner terminal = new Scanner(System.in);
	System.out.println("Introduce un numero válido: ");
	num = terminal.nextLine();
	
	//num positivo
	System.out.println(Pattern.matches(patronNum, num));
	
	//num negativo
	System.out.println(Pattern.matches(patronNumNeg, num));
	
	//comprobamos num positivo y negativo
	if(Pattern.matches(patronNum, num)) System.out.println(num +" numero entero +");
	else if (Pattern.matches(patronNumNeg, num))System.out.println(num+" num entero negativo");
	else System.out.println(num + " No es un numero entero");
		
	terminal.close();
	}

}
