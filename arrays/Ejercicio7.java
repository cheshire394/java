import java.util.*;
public class Ejercicio7 {
	
	public static void  buscarPosicion(int numUsuario) {
		
		int[] numero = new int[10];
		int posicion= -1;
		
		//rellenamos array
		for(int i = 0; i < numero.length; i++) {
			
			numero[i]= (int)(Math.random()*(10-1)+1);
			
			//y si encuentra una posicion devuelve la posicion
			if(numero[i] == numUsuario) {
				posicion = i; 
				break; //salimos del for
				
			}
			
		}
		
		System.out.println(Arrays.toString(numero));
		System.out.println();
		
		if(posicion == -1) {
		
		System.out.print(" Numero no encontrado, codigo de error --> "+posicion);
		
		}else {
			
			System.out.println("La posicion del numero es: "+posicion);
			
		}
		

	}

	public static void main(String[] args) {
	 /* 7. Rellena un array de 100 casillas con números aleatorios comprendidos
		entre 1 y 100 (ambos incluidos). Posteriormente pide un valor al usuario
		comprendido entre 1 y 100 (insiste en la lectura del valor hasta que el
		número sea válido y esté comprendido entre 1 y 100) y muestra en
		pantalla si el valor dado aparece en el array o no, y si aparece indica en
		qué posiciones del array aparece.
		*/
		//creamos la variable 
		

		
		
		
		Scanner terminal = new Scanner (System.in);
		
		
		int numUsuario = 0;
	
		
		while(numUsuario < 1 || numUsuario > 10) {
			
			System.out.println("Introduce un numero entre 1 y 10: ");
			numUsuario = terminal.nextInt(); 
			
			
			//solamente si el numero introducido es válido, ejecutamos el 
			//método que crea el array, y despues busca al número
			if(numUsuario >= 1 && numUsuario <= 10) buscarPosicion(numUsuario);
			
			System.out.println();
				
				
			
		
		}
		
		

		//creamos el array
		int numAleatorios []= new int[100];
		
		
		
		do {
			System.out.println("Introduce un número comeprendido entre 1 y 100: ");
			numUsuario = terminal.nextInt();
		}while(numUsuario <1 || numUsuario > 100 );
		
		//creamos un ciclo for que recorra todas las posiciones del array
		for (int i = 0; i< 100; i++) {
			//damos un valor aleatorio (entre 1 y 100) a cada posiicion del array
			numAleatorios [i] = (int)(Math.random()* (100-1+1)+1);
			System.out.println(numAleatorios[i]);
			if (numUsuario == numAleatorios[i]) {
				System.out.println("el número "+numUsuario+
						" se ubica en la posición "+i+ " del array");
				break;
				
			}
			
		
			
			
		}
		
		terminal.close();
	}

}
