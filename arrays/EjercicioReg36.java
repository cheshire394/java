import java.util.*;

import java.util.regex.*;
public class EjercicioReg36 {
	
	
	/*IPv4 es xxx.xxx.xxx.xxx, 
	 * donde cada "xxx" representa un bloque numérico que 
	 * puede tener valores de 0 a 255.
	 * Por lo tanto, cada bloque puede consistir en uno, dos o tres dígitos,
	 *  siempre 
	 * y cuando el valor total del bloque esté dentro del rango 0-255*/
	
	
	//CREAMOS CONSTANTES QUE RECOGEN EL PATRON
	private final String IP_NO_ESTRICTA = "^(\\d{1,3}\\.){3}\\d{1,3}$";
	
	//explicación: 
	//  \\d  es igual a digito,
	//  {1,3} que pueden ser 1, 2, o 3. digitos
	// seguido de un .
	//y todo esto entre parentesis para indicar que será 3 veces: xxx.xxx.xxx
	//el final del ip No tiene ., asi que creamos otro para el final sin //.
	//$ indica que ya no se espera más caracteres. Fin
	
	
	
	
	//creamos metodo ip mas sencillo, pero menos riguroso
	//ya que No tiene en cuenta que la ip comprende solo hasta el 255
	public  boolean validaIpNoEstricta (Scanner terminal) {
		System.out.println("Introduce una ip: ");
		 String ip = terminal.next();
		 Pattern pattern = Pattern.compile(IP_NO_ESTRICTA);
	        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
     
    }
	
	//IP ESTRICTA 
	 public static void validarIP(String ip) {
	        //String regexp = "^\\d{1,3}\\.{1}\\d{1,3}\\.{1}\\d{1,3}\\.{1}\\d{1,3}$";
	        //Mejora 1: Acepta rango 0-299
	        //String regexp = "^[12]?[0-9]?[0-9]\\.{1}[12]?[0-9]?[0-9]\\.{1}[12]?[0-9]?[0-9]\\.{1}[12]?[0-9]?[0-9]$";
	        //Mejora 2: Acepta rango 0-255
	        String regexp = "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

	        if(Pattern.matches(regexp, ip))
	            System.out.println(ip+" es una IP válida ");
	        else     
	            System.out.println(ip+" NO es una IP válida ");
	    }
	

	
	
	

	public static void main(String[] args) {
		/*36. Realiza un método que haciendo uso de una expresión regular, valide
		que el parámetro que se le pasa (será un String) es una dirección IP
		válida.*/
		
	
		/*^: Inicio de la cadena.
			([01]?\\d\\d?|2[0-4]\\d|25[0-5]):
			 Este fragmento valida cada bloque numérico (xxx)
			  y garantiza que esté en el rango de 0 a 255.
			\\.: Puntos que separan los bloques.
				$: Fin de la cadena.*/
		
		
		Scanner terminal = new Scanner(System.in);
		
	
		//creamos el objeto: No he podido utilizar static porque es constante
		//y entonces me obligaba a que fuera void y no boolean
		EjercicioReg36 ip_01 = new EjercicioReg36();
		
		//mostramos resultados
				if(ip_01.validaIpNoEstricta(terminal))System.out.println("Ip valida");
				else System.out.println("Ip no válida");
				
		EjercicioReg36.validarIP("3453.34555.223.22");

		
		terminal.close();
	}

}
