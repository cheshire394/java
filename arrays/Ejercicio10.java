import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * 10. Realiza un programa que lea desde teclado 10 números, pero que no permita
		 * introducir números repetidos. El programa acabará cuando haya obtenido 10
		 * números distintos que mostrará posteriormente en pantalla.
		 */
		
		Scanner terminal = new Scanner(System.in);
		
		HashSet<Integer> set = new HashSet<>();
	
		int numero;
		
		
		
		do {
		
		System.out.println("Introduce numero ");
		numero = terminal.nextInt();
		set.add(numero);
	
		}while(set.size() != 10);
		
		System.out.println("*********************");
		
		//METODO QUE CONVIERTE UN UN SET EN UNA ARRAY.
		Integer [] numeros = set.toArray(new Integer[set.size()]);
		
		System.out.println(Arrays.toString(numeros));
		
		
		

		final int FINAL_ARRAY = 10;

		

		int[] numRepe = new int[FINAL_ARRAY];
		System.out.println("Introduce el numero para la posición 1");
		numRepe[0] = terminal.nextInt();


		for (int i = 1; i < FINAL_ARRAY; i++) {
			System.out.println("Introduce el numero para la posición " + (i + 1));
			numRepe[i] = terminal.nextInt();
			// creamos un for que compruebe el ultimo número
			// con todos los anteriores
			for (int j = 0; j < i; j++) {
				if (numRepe[j] == numRepe[i]) {
					do {
						System.out.println("numero repetido detectado");
						System.out.println("introduce un nuevo numero para la" +
								" posicion " + (i+1));
						numRepe[i] = terminal.nextInt();
					} while (numRepe[j] == numRepe[i]);
				}
			}
			
		}
		System.out.println("FIN");

	}
}












