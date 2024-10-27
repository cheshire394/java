import java.util.*;
public class Ejercicio6 {
	
	
	
	
	public static void rellenar() {
		
		double [] notas = new double[10];
		
		double media= 0.0;
		int contador = 0; 
		
		for(int i = 0; i < notas.length; i++) {
			
			notas[i]= (double) Math.round((Math.random()*(10 - 0)+0));
			
			media += notas[i];
			
		}
		System.out.println("Mostramos las notas obtenidas "+ Arrays.toString(notas));
		
		media = media/notas.length;
		
		System.out.println("La nota media es"+ media);
		
		for(int i = 0; i < notas.length; i++) {
			
			if(notas[i] >= media) {
				System.out.println("Las notas que superan la media son: ");
				System.out.print(" "+notas[i]+" ");
				contador++;
				
			}
		
		}
		System.out.println("El total de notas que superan la media son "+contador);
	
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		/*6.Solicita las 10 notas con decimales de los alumnos de una clase. Calcula y
		muestra la nota media obtenida por el grupo. Muestra después cuántos
		alumnos tienen una nota superior o igual a la media.
		*/
		
		rellenar();
		
		//Constante
		final int FINAL_ARRAY = 10;
		
		
		//VARIABLES
		double suma=0, media=0;
		int contadorSup= 0;//SOLO CUERNTA LAS NOTAS QUE SUPEREN LA MEDIA.
		
		//Inicio el Scanner que te pide 10 notas con decimales
		Scanner terminal = new Scanner(System.in);

		
		//creamos el array
		double [] notasArray = new double[FINAL_ARRAY];
		
		
		//creamos un for que asigne la nota a las 10 posiciones del array.
		for (int i = 0; i < FINAL_ARRAY; i++) {
			System.out.println("Introduce la nota para la posición "+(i+1));
			notasArray[i]= terminal.nextDouble();
			
			//vamos a utilizar un do-while para que si una nota no esta entre (0-10) sea no válida y la pida otra vez
			//lo metemos dentro de un if para que solo do-while se ejecute solo en caso de que no sea valida.
			if ((notasArray[i] < 0 || notasArray[i] > 10)) {
			do {
				System.out.println("Nota introducida No válida, vuelve a introducir la nota"
						+ "para la posición: "+(i+1));
				notasArray[i]= terminal.nextDouble();
				}while(notasArray[i] < 0 || notasArray[i] > 10);
				}//cierre if		
		}//cierre for
		
		//creamos un for que sume las notas introducidas y nos las muestre:
		for(double copiArray : notasArray) {
			suma += copiArray; //ACTUALIZA LA SUMA DE LAS NOTAS.
			System.out.println("Las notas introducidas son las siguientes: "+copiArray);
		}
		
		//UNA VEZ HEMOS RECOGIDO LA SUMA, CALCULAMOS LA MEDIA y la mostramos
		media = suma /FINAL_ARRAY;
		System.out.println("La nota media es de "+media);
		
		/*una vez hemos calculado la media, creamos un for-each que solo muestre los alumnos aprobados
		 * y también nos calcule cuantos alumnos han superado la media--> contadorsup */
		
		System.out.println("La notas que superan la media son: ");//lo dejamos fuera del por para que no se repita 10 veces
		for (double superaMedia : notasArray) {
			if (superaMedia > media) {
				contadorSup++;
				System.out.println(superaMedia);
			}
		}
		//imprimimos el total de alumnos que superan la media:
		System.out.println("TOTAL DE ALUMNOS QUE SUPERAN LA MEDIA: "+ contadorSup);
		terminal.close();
		
		
		
	}}