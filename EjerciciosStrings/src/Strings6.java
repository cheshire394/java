
public class Strings6 {

	public static void main(String[] args) {
		/*Divide la cadena de texto “Hola Mundo” en dos partes “Hola ” y “Mundo”, usa
		substring de la clase String. Después, concaténalas y muestra de nuevo la palabra.*/
		
		
		        // Definimos una cadena de ejemplo
		        String originalString = "Hola, mundo";
		        // Usamos el método substring para obtener una parte de la cadena
		        // El primer argumento es el índice de inicio (inclusive) y el segundo es el índice de fin (exclusivo)
		        
		        
		        //para evvitar estar contando caracteres utilizamos indexOf:
		        System.out.println(originalString.indexOf("a"));
		        System.out.println(originalString.indexOf("m"));
		        
		        String hola = originalString.substring(0, 4); // Esto obtendrá "Hola,"
		        
		        String mundo = originalString.substring(6, originalString.length());
		        String concadenar = hola +" "+  mundo;
		        

		        // Imprimimos la cadena resultante
		        System.out.println("Cadena original: " + originalString);
		        System.out.println("Subcadena: " + hola);
		        System.out.println("Subcadena: " + mundo);
		        System.out.println(concadenar);
		    }
		


	}


