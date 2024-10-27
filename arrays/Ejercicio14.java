import java.util.Arrays;

public class Ejercicio14 {


	public static void  rellenar(int[] vector) {

		//rellenamos array
		for(int i = 0; i < vector.length; i++) {

			vector[i]= (int)(Math.random()*(10-0)+0);


		}

	}
	
	
	




	public static void main(String[] args) {
		/*14. Realiza un programa que rellene un vector de 5 posiciones con números
		aleatorios entre 0 y 10 (ambos incluidos). Copia dicho vector en otro de
		las dos formas posibles explicadas en clase. Muestra el vector original y
		el vector copia.*/

	
		int [] vectorOriginal = new int [5];
		int [] vectorCopia = new int [5];
		
		rellenar(vectorOriginal);
		
		
		System.arraycopy(vectorOriginal, 0, vectorCopia, 0, vectorOriginal.length);
		
		System.out.println("COPIA CON System.arraycopy");
		System.out.println(Arrays.toString(vectorCopia));
		
		
		/*
		
		
		//IMPRIMIMOS EL VECTOR ORIGINAL
		//concemos un número aleatorio a cada posición del vector
		System.out.print("vector original = ");//fuera del for para no reiterar.
		for(int i =0; i < vectorOriginal.length; i++) {
			//genera números aleatorios del 1 al 9
			vectorOriginal [i] = (int)(Math.random()*(9-1+1)+1);
			System.out.print(vectorOriginal[i]);
		}


		//COPIA CON FOR--> es necesario crear una vector copia PARA HACERLO CON FOR
		int [] copia = new int [vectorOriginal.length];

		System.out.println();//salto de linea
		for (int  i= 0; i < vectorOriginal.length;i++) {
			copia[i] = vectorOriginal[i]; //aqui estamos dando a copia los valores del original por cada vuelta
		}
		//for que imprime los resultados
		System.out.print("Vector copia con for normal: ");//fuera del for para no reiterar
		for(int i = 0; i < copia.length; i++) {
			System.out.print(copia[i]);
		}

		//con un for normal



		//COPIA CON FOR-EACH (EL VECTOR COPIA SE CREA DENTRO DEL PROPIO FOR)
		System.out.println();//salto de linea
		System.out.print("vector Copia for-each: ");//fuera del for para no reiterar.
		//creamos vector copia con for-each
		for(int vectorCopia : vectorOriginal) {
			System.out.print(vectorCopia);
		}

		System.out.println();//salto de linea decorativo

		//MÉTODO IMPORTADO DE API JAVA:
		int [] vectorJava = new int [vectorOriginal.length];
		System.arraycopy(vectorOriginal, 0, vectorJava, 0, vectorOriginal.length);
		System.out.print("Método arraycopy: ");
		//LOS RESULTADOS SE DEBEN DE IMPRIMIR CON UN FOR-EACH-->
		for (int copiaLaCopia: vectorJava) {
			System.out.print(copiaLaCopia);

		}*/

	}

}
