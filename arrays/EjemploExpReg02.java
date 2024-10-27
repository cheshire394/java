import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EjemploExpReg02 {

	public static void main(String[] args) {
		//Vamos a realizar un programa que valide un DNI
		String patronDNI = "\\d{8}[A-Z]{1}";
		String dniIntroducido;
		//boolean dniValidado;

		//Pedimos datos por teclado
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un DNI: ");
		dniIntroducido = sc.nextLine();
		sc.close();

		System.out.println(Pattern.matches(patronDNI, dniIntroducido));

		//Comprobamos si el DNI cumple el patrón de expresión regular
		//dniValidado = Pattern.matches(patronDNI, dniIntroducido);

	//si el dni es valido, separa el numero de la letra e imprimelo
		
		if(Pattern.matches(patronDNI, dniIntroducido)) {
			System.out.println("El " +dniIntroducido + " es válido");
			
			//extraemos la parte numerica
			
			Pattern patron = Pattern.compile("(\\d{8})([A-Z]{1})");
			Matcher matcher = patron.matcher(dniIntroducido);
			
			//buscamos los subpatrones separados por parentesis
			matcher.find();
			
			//mostramos en dos partes
			System.out.println("El numero es: "+matcher.group(1));
			System.out.println("El numero es: "+matcher.group(2));
		}
		
		
		
		else System.out.println ("El " +dniIntroducido + " NO es válido");
		
		
	}
}

