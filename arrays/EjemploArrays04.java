
public class EjemploArrays04 {
	// recuerda que args es string por defecto y si el array args no es de este tipo
	// habria que convertirlo ejemplo parseInt(nombre array);
	public static void main(String[] args) {
		// RECOGEMOS INFORMACION PASADA POR PARAMETRO

		// si conocemos el numero de parametos esperados:
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);

		// recorremos el array mediante el for
		for (int i = 0; i < args.length; i++) {
			// System.out.println(args[i]);

			// para pasar los parametros por consola --> (en dnde es run as)--> run
			// configurancion --> argumentos;
			// los espacios son detectados como el siguente posicion del array, si quieres
			// poner un nombre compuesto encomillar
			// ejemplo --> "jose pepe"

		}
		// recorremos mediante for each
		for (String copiaArgs : args) {
			// System.out.println(copiaArgs);
		}

		// como copiar un Array
		int[] array3 = { 1, 2, 3, 4, 5 };
		int[] arrayCopia3 = new int[array3.length];

		//EL PRIMER FOR RECORRE LAS POSICIONES
		for (int i = 0; i < array3.length; i++) {
			arrayCopia3[i] = array3[i];}
		
		//(NO ES ANIDADO) EL SEGUNDO FOR COPIA LOS NUMEROS
			for (int i = 0; i < arrayCopia3.length; i++) {
				System.out.print(arrayCopia3[i]);
			}
		

		// existe un método en java que permite copiar un array

		// array con copiado, posicion inicial, array copia, posicion inicial copia,
		// numero de elementos.
		System.arraycopy(array3, 0, arrayCopia3, 0, array3.length);
		System.out.println(arrayCopia3);

		System.arraycopy(array3, 0, arrayCopia3, 0, 3);
		System.out.println(arrayCopia3);
		
		//ejercicio imprime por pantalla --> 01230
		System.arraycopy(array3, 0, arrayCopia3, 1, 3); //3 elementos  xk copiamos 123 (0 es el origininal)
		System.out.println(arrayCopia3);
		
		//ejercio que imprime --> 01030
		System.arraycopy(array3, 0, arrayCopia3, 1, 1);
		System.arraycopy(array3, 2, arrayCopia3, 3, 1);
		System.out.println(arrayCopia3);
		
		
		
		
		
	}
}