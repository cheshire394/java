
public class Ejercicio16_2 {
	
	
	/*EXPLICACIÓN: paso parametros variables debe de ser UNICO
	 * Y DE UN SOLO TIPO(con los conocimientos actuales), 
	 * es decir, puedes pasar todos los parametros que quieras
	 * y del tipo que quieras de forma FIJA, antes de crear un
	 * paso parametros variables, como en el ejercicio 15.
	 * 
	 * ejemplo: 
	 * public void sobreCarga (double num1, double num2, int...numVariables) 
	 * 
	 * pero no puedes crear varios tipos de paso parametros variales
	 * en un solo metodo PORQUE SOLO ADMITE UNO, QUE DEBE INCRIBIRSE
	 * AL FINAL DEL METODO. 
	 * 
	 * 
	 * ejemplo NO PERMITIDO:
	 * public void pasoParametros ( String...cadena, int...numInt, float...numReal
	 * 
	 * */
	
	/*16. Crea una clase llamada Calcula. Implementa los siguientes métodos
	estáticos, que devolverán en cada caso el menor o mayor número de los
	pasados como parámetros. En el caso de las cadenas devolverá la de
	mayor o menor longitud.
	- int mayor(int … num )
	- float mayor(float … num)
	- String mayor(String … cadena)
	- int menor(int … num )
	- float menor(float … num)
	- String menor(String … cadena)
	Crea una clase aparte con el método main para probar todas las
	funcionalidades de la clase Calcula.*/
	
	/*NO VAMOS A CREAR NINGUN OBJETO, ES ESTATICO*/
	

	
	//creamos variables auxiliares
	// e invertimos sus valores
	private static float aux_max = Float.MIN_VALUE;
	private static float aux_min = Float.MAX_VALUE;
	
	private static int aux_maxInt = Integer.MIN_VALUE;
	private static int aux_minInt = Integer.MAX_VALUE;
	
	

	
	
	//SOLUCIÓN EJERCICIO 16, CREAR TRES METODOS PASOVARIABLES:
	
	public static  void pasoVarInt (int...numInt) {
		System.out.print("NUMEROS INTEGER INTRODUCIDOS: ");
		//imprimimos valores introducidos
		for(int copiaNumInt : numInt) {
			System.out.print(" "+copiaNumInt+" ");
			//mostramos el numero float mayor:
			if(copiaNumInt > aux_maxInt) {
				aux_maxInt = copiaNumInt;
			}
			if (copiaNumInt < aux_minInt) {
				aux_minInt = copiaNumInt;
			}
	}	
		System.out.println();
		System.out.println("El integer máximo  es: "+aux_maxInt);
		System.out.println("El integer minimo es: "+aux_minInt);
		
	}

	


	public static  void pasoVarFloat (float...numFloat) {
		System.out.print("NUMEROS FLOAT INTRODUCIDOS: ");
		//imprimimos valores introducidos
		for(float copiaNumFloat : numFloat) {
			System.out.print(" "+copiaNumFloat+" ");
			//mostramos el numero float mayor:
			if(copiaNumFloat > aux_max) {
				aux_max = copiaNumFloat;
			}
			if (copiaNumFloat < aux_min) {
				aux_min = copiaNumFloat;
			}
		}
		System.out.println();
		System.out.println("El float máximo  es: "+aux_max);
		System.out.println("El float minimo es: "+aux_min);
		
	}

	public static  void pasoVarString (String...cadena) {
		/*CREAMOS TRES VARIABLES LOCALES: 
		 * EL CONTADOR contara los caracteres de cada cadena que pasemos
		 * las otras dos variables son auxiliares que más tarde recogeran 
		 * el valor de cada cadena segun los resultados del cotador*/
		int contCadena = 0;
		String cadenaCorta = "";
		String cadenaLarga = "";
		System.out.println("LAS CADENAS INTRODUCIDAS");
		for(String copiaCadena : cadena) {
			//mostramos la cadenas introducidas
			System.out.print(" "+copiaCadena+" ");
			//BUSCAMOS LA CADENA MAS LARGA, CONTANDO LOS CARACTERES CON LENGTH
			if(copiaCadena.length()> contCadena) {
				//EL CONTADOR CONTIENE EL INT CON LA CADENA MAS LARGA ENCONTRADA
				contCadena = copiaCadena.length(); 
				//ESTA CADENA 
				cadenaLarga = copiaCadena; //esto nos devuelve un String
			}
			if(copiaCadena.length()< contCadena) {
				contCadena = copiaCadena.length();
				cadenaCorta = copiaCadena;
			}
			
		}
		System.out.println();
		System.out.println("La cadena mas larga es: "+ cadenaLarga);
		System.out.println("La cadena mas larga es: "+ cadenaCorta);
		
	
		}
	
	
	

	public static void main(String[] args) {
		
		//IMPORTANTE: LOS NUMEROS TIPO FLOAT SE DECLARAN ASI:
		Ejercicio16_2.pasoVarFloat(1.2f,1.3f,2.4f,5.5f,6.5f);
		
		Ejercicio16_2.pasoVarInt(1,2,3,4,5);
		
		Ejercicio16_2.pasoVarString("lacadenamaslarga","cadmedia", "corta");

	}

}
