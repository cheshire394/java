import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio5 {
	
	
	public static void rellenar() {
		
		int [] num = new int [100];
		
		ArrayList<Integer> impares = new ArrayList<>();
		
		
		for(int posicion = 0; posicion < num.length; posicion++) {
			
			num[posicion]= (int)(Math.random()*(100-1)+1);
			
			if(posicion % 2 != 0) {
				impares.add(num[posicion]);
			}
		
		}
		
		System.out.println("Todos los numeros "+Arrays.toString(num));
		System.out.println("numeros de posiciones impares "+impares);

	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		rellenar();
		
		
		
		/*5. Rellena un array de 100 casillas con números aleatorios comprendidos
		entre 1 y 100 (ambos incluidos). Muestra posteriormente los valores
		almacenados en las casillas impares del array.
		*/
		
		int [] arrayAleatorio = new int [100];
		//si solamente se imprimen los numeros impares tendrán que imprimirse 50 posiciones en vez de 100
		//creamos una contador que nos confirme que se han impreso 50 posiciones
		int contadorPosiciones = 0;
		
		//iniciamos en 1 porque es impar e incrementamos + 2 en cada itetacion--> posiciones 1, 3, 5, 7......
		for(int i = 1; i< 101; i+=2) {
			arrayAleatorio[i] = (int)(Math.random()*(100 - 1 +1)+1);
			System.out.println(arrayAleatorio[i]);
			contadorPosiciones++;
		}
		
		System.out.println("La cantidad de posiciones impresas es de "+contadorPosiciones);
		
		

	}

}
