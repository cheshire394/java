
public class resumenStrings {

	public static void main(String[] args) {
		//vamos a crear un resumen de todo los aprendido. 
		
		//definimos dos variables.
		String var1 = "hola mundo, hola mundo";
		String var2 = "HOLA MUNDO";
		
		//COMPROBAMOS CASI TODOS LOS MÉTODOS APRENDIDOS:
		
		//método charAt:
		
		
		//charAt no permite meter varios caracteres a la vez...sólo uno.
		// Es útil para iterar con for, pero no nos deja iniciar el ciclo con ellos.
		System.out.println(var1.charAt(5)); //NOS DEVUELVE LA LETRA QUE OCUPA ESE CARACTER. //M
		
		//ESTO ES INCORRECTO, SI QUEREMOS ENTREGAR UNA LETRA Y QUE NOS DEVUELVA LA POSICIÓN ENTONCES USAREMOS indexOf();
		//System.out.println(var1.charAt('m'));
		
		//método indexOf();
		//index es útil para cuando queremos iterar una cadena y queremos saber ue caracter ocupa hasta dónde queremos iterar.
		System.out.println(var1.indexOf('m')); //nos devuelve 5. Es lo contrario a charAt();	
		System.out.println(var1.indexOf("mu")); // nos permite meter varios caracteres continuos, pero solo nos devuelve la posicion del primero
		
		//AL IGUAL QUE charAt, solo admite un caracter por código.
		
		//método REPLACE; 
		//COMO BIEN YA SABES LAS VARIABLES STRING SON INMODIFICABLES.
		// ESTO SE TRADUCE EN QUE PARA UTILIZAR REPLACE ES OBLIGATORIO CREAR UNA VARIABLE NUEVA.
		String var3, var4;
		System.out.println( var3 = var1.replace('a', 'e')); //hole mundo hole mundo
		
		//SUBSTRING 
		//(crea un nuevo string al partir un string ya creado, debes coger el inicio y final -1.  como range)
		System.out.println(var4 = var1.substring(5, 7));
		
		// toLowerCase minúsculas todo. toUpperCase(); mayusculas
		System.out.println(var1.toLowerCase());
		
		//Equals, equalsIgnoreCase: //dice si una variable es igual a la otra en su valor.
		System.out.println(var1.equals(var2));
		
		//CONTAINS dice si una variable contiene un determinadado caracter.
		System.out.println(var1.contains(var4)); //retorna true porque var4 es un substring de var1. y tiene los mismos caracteres.
		String var5 = "munde"; //aqui hemos modificado una letra para ver que retorna
		System.out.println(var1.contains(var5)); //obiamente munde no es lo mismo que mundo retorna false.
		
		//legth te muestra la logitud y es muy bien admitida en los ciclos for.
		
		//CAMBIAMOS EL VARLOR DE UN STRING A OTRO TIPO DE VARIABLE:

		String cadenaEntero = "123";
		int entero = Integer.parseInt(cadenaEntero);
		boolean valor = Boolean.parseBoolean("true");
		System.out.println(valor);
		double decimal = Double.parseDouble("23.45");
		System.out.println(decimal);
		
		
		
		//CAMBIAMOS CUALQUIER TIPO DE VARIABLE A STRING
		int numero = 46;
		String cadenaNumerica = String.valueOf(numero);
		double decimal2 = 34.75;
		String cadenaDecimal = String.valueOf(decimal2);
		
		int numero2 = 1994;
		String numero3 = String.valueOf(numero2);
		System.out.println(numero3);
		
		
		//IMPRIME UNA PALABRA EN VERTICAL:
		
		String vertical = "imprimir vertical";
		
		for ( int i = 0; i < vertical.length(); i++) {
			System.out.println(vertical.charAt(i));
		}
		
		//REVERTIR UN STRING:
		String invertir = "revertir string";
		
		String vacio_revierte = "";
		
		//iniciamos desde el final, hasta el incio en descendencia
		for (int i = invertir.length()-1; i >= 0; i--) {
			
				vacio_revierte += (invertir.charAt(i));
				
		}
		System.out.println(vacio_revierte);
		
		
	} 
		
	}


