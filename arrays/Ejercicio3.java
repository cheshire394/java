import java.util.Arrays;

public class Ejercicio3 {
	
	public  static void rellenar() {
		
		int maximo = Integer.MIN_VALUE;
		int minimo = Integer.MAX_VALUE;
		int intercambio;
		
		int [] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			
			numeros[i]= (int)(Math.random()*(100-1)+1);
			
			if(numeros[i] > maximo) maximo = numeros[i];
			else if (numeros[i]< minimo) minimo = numeros[i];
			
		}
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("El numero maximo es "+maximo);
		System.out.println("El numero minimo es "+minimo);

	}

	public static void main(String[] args) {
		/*
		 * 3. Realiza un programa que rellene un array de 10 enteros con 10 números
		 * aleatorios entre 1 y 100 (ambos incluidos). A continuación, muestra el mínimo
		 * y máximo número almacenado en el array. Nota: Para generar números
		 * aleatorios, investiga sobre la clase Random
		 */

		/*
		 * // EJEMPLO--> Numero entero entre 25 y 75: LA FORMULA ES --> variable = (int)
		 * (Math.random()*(x - y + 1)+ y); siendo x el número más alto e y el número más
		 * bajo. int n = numAleatorio.nextInt(75-25+1) + 25;
		 */

		

		//creamos las variables que almacenan el numero minimo y maximo
		// Inicialmete tienen los valores invertidos
		int auxiliarMax = Integer.MIN_VALUE;
		int auxiliarMin = Integer.MAX_VALUE;

		int[] numAleatorios = new int[10];

		// el for recorre el numero de numeros que imprimos, en este caso son 10.
		for (int i = 0; i < numAleatorios.length; i++) {
			// genera numeros aleatorios del 1 al 100.
			numAleatorios[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
			System.out.print(numAleatorios[i] + "\t");

			if (numAleatorios[i] > auxiliarMax) { 
				auxiliarMax = numAleatorios[i];}
			if
			(numAleatorios[i] < auxiliarMin) {
				auxiliarMin = numAleatorios[i];}

		}
		System.out.println(); 
		System.out.println("El número más bajo es: "+auxiliarMin); 

		System.out.println("El número más alto es: "+ auxiliarMax); 
		
		System.out.println("******************METODO*****************************");
		rellenar();
		
		

	}
}
