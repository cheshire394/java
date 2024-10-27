
public class Strings3 {

	public static void main(String[] args) {
		/*Invertir el texto: “Hola Mundo”.*/
		
		
		//declaramos las variables y las iniciamos.
		String invertir = "Hola Mundo", vacio_invertir = "";
		 
		
		//iniciamos al final de legth ES IMPORTANTISMO RESTAR 1; i ES MAYOR A 0, DESCENDEMOS
		for (int i = invertir.length()-1; i >= 0; i--) {
			//ahora vamos a usar la variable vacio_revertir, que explica su contenido y su función:
			//vamos a sumarla a cada iteración de invertir. CON chatAt(i);
			  vacio_invertir += (invertir.charAt(i));
			 
		}
		
		//resultados
		System.out.println("texto original: "+invertir+ "La frase invertida: "+ vacio_invertir);
		

	}

}
