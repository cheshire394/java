package Ejercicios;

public class Ejercicio6 {
	
	
	/*Ejercicio 6
		Crea una clase con un método main() que genere un objeto de la
		clase Exception dentro de un bloque try. Proporciona al constructor
		de Exception un argumento String. Captura la excepción dentro de una
		cláusula catch e imprime el argumento String. Añade una cláusula finally e
		imprime un mensaje para demostrar que pasó por allí.*/

	public static void main(String[] args) {
		
		
		try {
			
			
			throw new Exception("SOY NEW EXCEPTION, CREADA EN EN TRY.....ESTE MENSAJE ESTA SIENDO CREADO COMO UN CONSTRUCTOR DE NEWEXCEPTION ");
			
			
		}catch(Exception e) {
			
			System.out.println("SOY EL CATCH....que ha capturado a NEW EXCEPTION pero no imprimo constructor porque me falta getMessage ");
			System.out.println("Yo también soy catch, pero soy capaz de imprimir el mensaje creado en el constructor de la Excepcion"
					+ "gracias a getMessage() "+ e.getMessage());
			
		}finally {
			
			System.out.println("YO SOY FINALLY, Y PASE LO QUE PASE SIEMPRE ME EJECUTO");
		}
		
		
		
		
	}

}
